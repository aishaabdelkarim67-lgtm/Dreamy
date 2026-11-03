
package org.example.dreamy.repository;

import org.example.dreamy.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository
        extends JpaRepository<Wishlist, Long> {
}
