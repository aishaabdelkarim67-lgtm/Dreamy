package org.example.dreamy.service;

import org.example.dreamy.model.Wishlist;
import org.example.dreamy.repository.WishListRepository;
import org.springframework.stereotype.Service;

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

// Hente en ønskeliste via ID
public Wishlist getWishlistByid(long id){
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












