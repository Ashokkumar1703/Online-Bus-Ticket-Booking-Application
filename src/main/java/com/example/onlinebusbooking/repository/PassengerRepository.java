package com.example.onlinebusbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.onlinebusbooking.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}