import React, { useState } from 'react';
import axios from 'axios';

const Booking = () => {
    const [passengerName, setPassengerName] = useState('');
    const [seats, setSeats] = useState(1);

    const handleBooking = async (e) => {
        e.preventDefault();
        const token = localStorage.getItem('token');
        try {
            await axios.post('/book', { passengerName, seats: parseInt(seats) }, {  // Ensure seats is an integer
                headers: {
                    Authorization: `Bearer ${token}`
                }
            });
            alert('Booking successful!');
        } catch (error) {
            console.error('Booking failed', error);
            alert('Booking failed. Please try again.'); // Improved user feedback
        }
    };

    return (
        <form onSubmit={handleBooking}>
            <input type="text" value={passengerName} onChange={(e) => setPassengerName(e.target.value)} placeholder="Passenger Name" required />
            <input type="number" value={seats} onChange={(e) => setSeats(e.target.value)} placeholder="Number of Seats" min="1" required />
            <button type="submit">Book Now</button>
        </form>
    );
};

export default Booking;