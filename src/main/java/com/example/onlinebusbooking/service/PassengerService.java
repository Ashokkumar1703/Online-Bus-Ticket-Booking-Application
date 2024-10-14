package com.example.onlinebusbooking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.onlinebusbooking.model.Passenger;
import com.example.onlinebusbooking.repository.PassengerRepository;

@Service
public class PassengerService {
    
    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public Passenger savePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }
}