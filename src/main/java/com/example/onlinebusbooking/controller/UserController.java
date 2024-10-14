package com.example.onlinebusbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication; // Correct import
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.onlinebusbooking.model.ChangePasswordRequest;
import com.example.onlinebusbooking.model.User;
import com.example.onlinebusbooking.service.UserService;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired // Add this to ensure Spring injects the service
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // This should return the view name (consider using Thymeleaf templates)
    }

    @PostMapping("/register")
    public String registerUser(@Valid @RequestBody User user, BindingResult bindingResult) { // Added @RequestBody
        if (bindingResult.hasErrors()) {
            return "register"; // Return to registration form if there are errors
        }
        userService.save(user);
        return "redirect:/login"; // Redirect to login page after registration
    }

    @PostMapping("/change-password")
    public ResponseEntity<String> changePassword(@RequestBody ChangePasswordRequest request, Authentication authentication) {
        String username = authentication.getName(); // Use getName() to get the username
        userService.changePassword(username, request.getCurrentPassword(), request.getNewPassword());
        return ResponseEntity.ok("Password changed successfully");
    }
}