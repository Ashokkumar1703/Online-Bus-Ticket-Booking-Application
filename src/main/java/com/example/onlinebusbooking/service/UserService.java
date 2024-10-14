package com.example.onlinebusbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.onlinebusbooking.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        // Consider adding password encoding logic here
        return userRepository.save(user);
    }

    public void changePassword(String username, String currentPassword, String newPassword) {
        // Logic for changing the password
    }
}