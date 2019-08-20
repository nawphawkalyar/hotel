package com.example.hotelmanagementsystem.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookingNumber;
    private int numbersOfAdults;
    private int numbersOfChildren;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate start;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate toEnd;
    private boolean bookingCancelled;
    private double inAdvance;
    private double fullCharges;
    @ManyToOne
    private UserProfile userProfile;


    public Bookings() {
    }



    public Bookings(String bookingNumber, int numbersOfAdults, int numbersOfChildren, LocalDate start, LocalDate toEnd, boolean bookingCancelled, double inAdvance, double fullCharges, UserProfile userProfile) {
        this.bookingNumber = bookingNumber;
        this.numbersOfAdults = numbersOfAdults;
        this.numbersOfChildren = numbersOfChildren;
        this.start = start;
        this.toEnd = toEnd;
        this.bookingCancelled = bookingCancelled;
        this.inAdvance = inAdvance;
        this.fullCharges = fullCharges;
        this.userProfile = userProfile;

    }
}
