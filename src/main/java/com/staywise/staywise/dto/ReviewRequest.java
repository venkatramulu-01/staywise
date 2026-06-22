package com.staywise.staywise.dto;

import lombok.Data;

@Data
public class ReviewRequest {

    private int rating;
    private String comment;
    private Long userId;
    private Long pgId;
}