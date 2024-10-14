package com.example.onlinebusbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.onlinebusbooking.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {
}