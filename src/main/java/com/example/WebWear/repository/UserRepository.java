package com.example.WebWear.repository;

import com.example.WebWear.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}