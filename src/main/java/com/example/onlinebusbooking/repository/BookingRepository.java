package com.example.onlinebusbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.onlinebusbooking.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}