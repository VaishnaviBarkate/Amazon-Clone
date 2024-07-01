package com.example.Amazon.Clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Amazon.Clone.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);

}
