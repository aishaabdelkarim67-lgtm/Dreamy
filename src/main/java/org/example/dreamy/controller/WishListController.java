package org.example.dreamy.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/whishlists")

public class WishListController {

    @GetMapping
    public String getAllWishlists(){
        return"Her skal alle ønskesedler vises";
    }

    @GetMapping("/{id}")
    public String getWishlistById(@PathVariable int id){
        return"Viser ønskeseddel med ID:" + id;
    }

    @PostMapping
    public String createWishlist(){
        return "En ny ønskeseddel skal oprettes";
    }
}
