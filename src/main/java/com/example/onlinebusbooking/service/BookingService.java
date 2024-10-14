package com.example.onlinebusbooking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.onlinebusbooking.model.Booking;
import com.example.onlinebusbooking.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

    public List<Booking> getBookingsByUsername(String username) {
        // Implement the logic to retrieve bookings by username
        return null; // Replace with actual implementation
    }

    public Booking bookTickets(Booking bookingRequest, String username) {
        // Implement the logic to book tickets
        return null; // Replace with actual implementation
    }
}