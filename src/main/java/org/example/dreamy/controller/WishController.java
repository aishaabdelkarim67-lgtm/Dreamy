package org.example.dreamy.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wishlists/{wishlistId}/wishes")
public class WishController {

    // Hent alle ønsker fra en ønskeseddel
    @GetMapping
    public String getAllWishes(@PathVariable int wishlistId) {
        return "Viser ønsker fra ønskeseddel: " + wishlistId;
    }

    // Hent et bestemt ønske
    @GetMapping("/{wishId}")
    public String getWishById(
            @PathVariable int wishlistId,
            @PathVariable int wishId) {

        return "Viser ønske " + wishId
                + " fra ønskeseddel " + wishlistId;
    }

    // Tilføj et nyt ønske
    @PostMapping
    public String createWish(@PathVariable int wishlistId) {
        return "Tilføjer et ønske til ønskeseddel: " + wishlistId;
    }

    // Slet et ønske
    @DeleteMapping("/{wishId}")
    public String deleteWish(
            @PathVariable int wishlistId,
            @PathVariable int wishId) {

        return "Sletter ønske " + wishId
                + " fra ønskeseddel " + wishlistId;
    }
}
