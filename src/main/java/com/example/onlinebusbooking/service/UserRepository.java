package com.example.onlinebusbooking.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.onlinebusbooking.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

	<S extends User> S save(S user);
}