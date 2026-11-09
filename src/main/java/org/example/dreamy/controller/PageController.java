package org.example.dreamy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.example.dreamy.model.Wishlist;
import org.example.dreamy.service.WishlistService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.example.dreamy.model.Wish;



@Controller
public class PageController {

    private final WishlistService wishlistService;

    public PageController(WishlistService wishlistService){
    this.wishlistService = wishlistService;
}



    @GetMapping("/")

    public String home(Model model){
        model.addAttribute("wishlists", wishlistService.getAllWishlists());
        return "index";

    }

    @GetMapping("/wishlists/new")

    public String createWishList(){
        return "create-wishlist";
    }
    @PostMapping("/wishlists")
    public String saveWishList(@RequestParam String name) {
        Wishlist wishlist = new Wishlist();
        wishlist.setName(name);

        Wishlist savedWishlist = wishlistService.createWishlist(wishlist);

        return "redirect:/wishlists/" + savedWishlist.getId();

    }

    @GetMapping("/wishlists/{id}")
    public String showWishList(@PathVariable long id, Model model) {
        Wishlist wishlist = wishlistService.getWishlistById(id);

        model.addAttribute("wishlist", wishlist);
        model.addAttribute("wishes", wishlist.getWishes());

        return "wishlist";
    }
    @PostMapping("/wishlists/{id}/wishes")
    public String addWish(@PathVariable long id,
                          @RequestParam String name,
                          @RequestParam(defaultValue = "0") double price,
                          @RequestParam(required = false) String link)
    {

        Wish wish = new Wish();
        wish.setName(name);
        wish.setPrice(price);
        if (link != null && !link.isBlank()) {
            link = link.trim();

            if (!link.startsWith("http://") &&
                    !link.startsWith("https://")) {
                link = "https://" + link;
            }
        }

        wish.setProductUrl(link);


        wishlistService.addWishToWishlist(id, wish);

        return "redirect:/wishlists/" + id;
    }
    @PostMapping("/wishlists/{id}/delete")
    public String deleteWishlist(@PathVariable long id) {
        wishlistService.deleteWishlist(id);
        return "redirect:/";
    }


}


