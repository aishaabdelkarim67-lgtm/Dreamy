package org.example.dreamy.controller;

import org.example.dreamy.model.Wishlist;
import org.example.dreamy.model.Wish;
import org.example.dreamy.service.WishlistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wishlists")
public class WishListController {

    private final WishlistService wishlistService;

    // Constructor
    public WishListController(WishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    // Henter alle ønskelister
    @GetMapping
    public List<Wishlist> getAllWishlists() {
        return wishlistService.getAllWishlists();
    }

    // Henter en ønskeliste via ID
    @GetMapping("/{id}")
    public Wishlist getWishlistById(@PathVariable int id) {
        return wishlistService.getWishlistById(id);
    }

    // Opretter en ny ønskeliste
    @PostMapping
    public Wishlist createWishlist(@RequestBody Wishlist wishlist) {
        return wishlistService.createWishlist(wishlist);
    }

    // Tilføjer et ønske til en ønskeliste
    @PostMapping("/{id}/wishes")
    public Wishlist addWish(@PathVariable long id, @RequestBody Wish wish) {
        return wishlistService.addWishToWishlist(id, wish);
    }
}
