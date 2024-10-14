import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Profile = () => {
    const [user, setUser] = useState({});
    const [bookingHistory, setBookingHistory] = useState([]);
    const [currentPassword, setCurrentPassword] = useState('');
    const [newPassword, setNewPassword] = useState('');
    const [message, setMessage] = useState('');
    const [errorMessage, setErrorMessage] = useState(''); // For displaying error messages

    useEffect(() => {
        const fetchData = async () => {
            const token = localStorage.getItem('token');
            try {
                const userResponse = await axios.get('/profile', {
                    headers: { Authorization: `Bearer ${token}` }
                });
                setUser(userResponse.data);

                const bookingsResponse = await axios.get('/bookings', {
                    headers: { Authorization: `Bearer ${token}` }
                });
                setBookingHistory(bookingsResponse.data);
            } catch (error) {
                console.error('Error fetching data:', error);
                setErrorMessage('Failed to fetch user data.'); // Improved error handling
            }
        };
        fetchData();
    }, []);

    const handlePasswordChange = async (e) => {
        e.preventDefault();
        const token = localStorage.getItem('token');
        try {
            await axios.post('/change-password', {
                currentPassword,
                newPassword
            }, {
                headers: { Authorization: `Bearer ${token}` }
            });

            setMessage('Password changed successfully');
            setCurrentPassword('');
            setNewPassword('');
            setErrorMessage(''); // Clear any previous error message
        } catch (error) {
            setMessage('');
            setErrorMessage('Error changing password. Please try again.'); // Improved error feedback
            console.error('Error:', error);
        }
    };

    return (
        <div>
            <h2>User Profile</h2>
            <p>Name: {user.name}</p>
            <p>Email: {user.email}</p>
            <h3>Booking History</h3>
            <ul>
                {bookingHistory.map(booking => (
                    <li key={booking.id}>{booking.details}</li>
                ))}
            </ul>
            <h3>Change Password</h3>
            <form onSubmit={handlePasswordChange}>
                <input 
                    type="password" 
                    value={currentPassword} 
                    onChange={(e) => setCurrentPassword(e.target.value)} 
                    placeholder="Current Password" 
                    required 
                />
                <input 
                    type="password" 
                    value={newPassword} 
                    onChange={(e) => setNewPassword(e.target.value)} 
                    placeholder="New Password" 
                    required 
                />
                <button type="submit">Change Password</button>
            </form>
            {message && <p style={{color: 'green'}}>{message}</p>}
            {errorMessage && <p style={{color: 'red'}}>{errorMessage}</p>} {/* Error message */}
        </div>
    );
};

export default Profile;