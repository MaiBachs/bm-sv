package com.example.demo.repository;

import com.example.demo.entity.CreditCards;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CreditCardsRepository extends JpaRepository<CreditCards, Integer> {
    Page<CreditCards> findByLocked(Boolean blocked, Pageable pageable);

    @Query("SELECT COUNT(c) FROM CreditCards c WHERE c.locked = true")
    long totalCardLokced();

    @Query("SELECT COUNT(c) FROM CreditCards c")
    long totalCard();
}
