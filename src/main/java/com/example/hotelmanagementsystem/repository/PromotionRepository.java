package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.model.Promotions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotions,Long> {
}
