package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.model.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Bookings,Long> {
}
