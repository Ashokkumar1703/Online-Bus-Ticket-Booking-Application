package com.example.onlinebusbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.onlinebusbooking.model.Passenger;
import com.example.onlinebusbooking.service.PassengerService;

@RestController
@RequestMapping("/api/passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @PostMapping
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerService.savePassenger(passenger);
    }
}