package com.staywise.staywise.repository;

import com.staywise.staywise.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}