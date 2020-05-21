package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojos.User;

public interface UserRepo extends JpaRepository<User, String> {

}
