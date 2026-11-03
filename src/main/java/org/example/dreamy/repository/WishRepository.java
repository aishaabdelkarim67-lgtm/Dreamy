
package org.example.dreamy.repository;

import org.example.dreamy.model.Wish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishRepository
        extends JpaRepository<Wish, Long> {
}
