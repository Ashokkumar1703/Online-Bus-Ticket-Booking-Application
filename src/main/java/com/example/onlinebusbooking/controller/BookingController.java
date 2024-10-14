package com.example.onlinebusbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication; // Correct import
import org.springframework.web.bind.annotation.*;

import com.example.onlinebusbooking.model.Booking;
import com.example.onlinebusbooking.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }

    @DeleteMapping("/{id}")
    public void cancelBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
    }

    @GetMapping("/user") // Changed path to avoid confusion with getAllBookings
    public ResponseEntity<List<Booking>> getUserBookings(Authentication authentication) {
        String username = authentication.getName(); // Corrected method to get username
        List<Booking> bookings = bookingService.getBookingsByUsername(username);
        return ResponseEntity.ok(bookings);
    }

    @PostMapping("/book")
    public ResponseEntity<Booking> bookTickets(@RequestBody Booking bookingRequest, Authentication authentication) {
        String username = authentication.getName();
        Booking booking = bookingService.bookTickets(bookingRequest, username);
        return ResponseEntity.ok(booking); // Return the created booking details
    }
}