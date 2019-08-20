package com.example.hotelmanagementsystem.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class BookingMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ElementCollection
    private List<String> reserveList=new ArrayList<>();
    @ElementCollection
    private List<String> freeReserveList=new ArrayList<>();
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dilyReserve;
    @ManyToOne
    private Rooms rooms;
    @ManyToOne
    private Bookings bookings;
    @ManyToOne
    private Promotions promotions;

    public BookingMenu() {
    }

    public BookingMenu(LocalDate dilyReserve) {
        this.dilyReserve = dilyReserve;
    }


}
