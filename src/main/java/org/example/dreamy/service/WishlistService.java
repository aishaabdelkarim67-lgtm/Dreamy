
package org.example.dreamy.service;

import org.example.dreamy.model.Wishlist;
import org.example.dreamy.model.Wish;
import org.example.dreamy.repository.WishListRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WishlistService {

    private final WishListRepository wishListRepository;

    public WishlistService(WishListRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    // Henter alle ønskelister
    public List<Wishlist> getAllWishlists() {
        return wishListRepository.findAll();
    }

    // Opretter en ønskeliste
    public Wishlist createWishlist(Wishlist wishlist) {
        return wishListRepository.save(wishlist);
    }

    // Henter en ønskeliste via ID
    public Wishlist getWishlistById(long id) {
        return wishListRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Ønskeliste blev ikke fundet: " + id)
                );
    }

    // Tilføjer et ønske
    public Wishlist addWishToWishlist(long id, Wish wish) {
        Wishlist wishlist = getWishlistById(id);
        wishlist.addWish(wish);
        return wishListRepository.save(wishlist);
    }

    // Gemmer en ønskeliste
    public Wishlist saveWishlist(Wishlist wishlist) {
        return wishListRepository.save(wishlist);
    }

    // Sletter en ønskeliste
    public void deleteWishlist(long id) {
        wishListRepository.deleteById(id);
    }

    // Deler en ønskeliste
    public Wishlist shareWishlist(long id) {
        Wishlist wishlist = getWishlistById(id);
        wishlist.setShareId(UUID.randomUUID().toString());
        return wishListRepository.save(wishlist);
    }
}
