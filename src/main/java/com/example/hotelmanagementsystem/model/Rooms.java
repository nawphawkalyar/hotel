package com.example.hotelmanagementsystem.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomsNumber;
    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus;


    public Rooms(String roomsNumber, RoomType roomType, RoomStatus roomStatus) {
        this.roomsNumber = roomsNumber;
        this.roomType = roomType;
        this.roomStatus = roomStatus;

    }
}

