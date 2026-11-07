package org.example.dreamy.service;

import org.example.dreamy.model.Wishlist;
import org.example.dreamy.repository.WishListRepository;
import org.springframework.stereotype.Service;
import org.example.dreamy.model.Wish;

import java.util.List;

@Service
public class WishlistService {
    private final WishListRepository wishListRepository;

    //Constructor
    public WishlistService(WishListRepository wishListRepository){
        this.wishListRepository= wishListRepository;}


// Henter alle ønskelister
public List<Wishlist> getAllWishlists() {
    return wishListRepository.findAll();
}

// oprettelse af ønskeseddel
public Wishlist createWishlist(Wishlist wishlist){
        return wishListRepository.save(wishlist);
}

    // Tilføjer et ønske til en ønskeseddel
    public Wishlist addWishToWishlist(long id, Wish wish) {
        Wishlist wishlist = getWishlistById(id);
        wishlist.addWish(wish);
        return wishListRepository.save(wishlist);
    }

// Hente en ønskeliste via ID
public Wishlist getWishlistById(long id){
    return wishListRepository.findById(id).orElse(null);
    }

// Gem en ønskeliste
public Wishlist saveWishlist(Wishlist wishlist){
    return wishListRepository.save(wishlist);
    }

// Slet en ønskeliste
public void deleteWishlist(long id){
    wishListRepository.deleteById(id);}
}












