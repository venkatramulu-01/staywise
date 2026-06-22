package com.staywise.staywise.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="pgs")
public class PG {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String city;

    private String address;

    private double rent;

    private String description;

    private double foodRating;

    private double wifiRating;

    private double cleanlinessRating;

    private double securityRating;

    private int availableBeds;
}