package com.staywise.staywise.controller;

import com.staywise.staywise.dto.ReviewRequest;
import com.staywise.staywise.entity.PG;
import com.staywise.staywise.entity.Review;
import com.staywise.staywise.entity.User;
import com.staywise.staywise.repository.PGRepository;
import com.staywise.staywise.repository.ReviewRepository;
import com.staywise.staywise.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final PGRepository pgRepository;

    public ReviewController(
            ReviewRepository reviewRepository,
            UserRepository userRepository,
            PGRepository pgRepository) {

        this.reviewRepository = reviewRepository;
        this.userRepository = userRepository;
        this.pgRepository = pgRepository;
    }

    @PostMapping
    public Review addReview(@RequestBody ReviewRequest request) {

        User user = userRepository.findById(request.getUserId())
                .orElseThrow();

        PG pg = pgRepository.findById(request.getPgId())
                .orElseThrow();

        Review review = Review.builder()
                .rating(request.getRating())
                .comment(request.getComment())
                .createdAt(LocalDateTime.now())
                .user(user)
                .pg(pg)
                .build();

        return reviewRepository.save(review);
    }

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}