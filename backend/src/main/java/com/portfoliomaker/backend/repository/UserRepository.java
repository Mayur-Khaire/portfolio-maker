package com.portfoliomaker.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfoliomaker.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}