
package org.example.dreamy.repository;

import org.example.dreamy.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WishListRepository
        extends JpaRepository<Wishlist, Long> {
    Optional<Wishlist> findByShareId(String shareId);

}
