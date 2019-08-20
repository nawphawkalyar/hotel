package com.example.hotelmanagementsystem.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Promotions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seasonal;

    private String packageProMotion;
    //percent
    private double discount;

    private String service;

    public Promotions() {
    }

    public Promotions(String seasonal, String packageProMotion, double discount, String service) {
        this.seasonal = seasonal;
        this.packageProMotion = packageProMotion;
        this.discount = discount;
        this.service = service;
    }
}
