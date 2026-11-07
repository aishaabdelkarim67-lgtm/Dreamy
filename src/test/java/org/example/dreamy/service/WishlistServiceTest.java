package org.example.dreamy.service;

import org.example.dreamy.model.Wishlist;
import org.example.dreamy.model.Wish;
import org.example.dreamy.repository.WishListRepository;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class WishlistServiceTest {

    private final WishListRepository repository =
            mock(WishListRepository.class);

    private final WishlistService service =
            new WishlistService(repository);

    @Test
    void getAllWishlists() {
        when(repository.findAll()).thenReturn(List.of(new Wishlist()));

        List<Wishlist> result = service.getAllWishlists();

        assertEquals(1, result.size());
    }

    @Test
    void createWishlist() {
        Wishlist wishlist = new Wishlist();

        when(repository.save(wishlist)).thenReturn(wishlist);

        Wishlist result = service.createWishlist(wishlist);

        assertNotNull(result);
        verify(repository).save(wishlist);
    }

    @Test
    void addWishToWishlist() {
        Wishlist wishlist = new Wishlist();
        Wish wish = new Wish();

        when(repository.findById(1L))
                .thenReturn(Optional.of(wishlist));
        when(repository.save(wishlist)).thenReturn(wishlist);

        Wishlist result = service.addWishToWishlist(1L, wish);

        assertNotNull(result);
        assertEquals(1, result.getWishes().size());
    }

    @Test
    void getWishlistById() {
        Wishlist wishlist = new Wishlist();

        when(repository.findById(1L))
                .thenReturn(Optional.of(wishlist));

        Wishlist result = service.getWishlistById(1L);

        assertNotNull(result);
    }

    @Test
    void saveWishlist() {
        Wishlist wishlist = new Wishlist();

        when(repository.save(wishlist)).thenReturn(wishlist);

        Wishlist result = service.saveWishlist(wishlist);

        assertNotNull(result);
    }

    @Test
    void deleteWishlist() {
        service.deleteWishlist(1L);

        verify(repository).deleteById(1L);
    }

    @Test
    void shareWishlist() {
        Wishlist wishlist = new Wishlist();

        when(repository.findById(1L))
                .thenReturn(Optional.of(wishlist));
        when(repository.save(any(Wishlist.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));

        Wishlist result = service.shareWishlist(1L);

        assertNotNull(result.getShareId());
        verify(repository).save(wishlist);
    }
}