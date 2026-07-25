package com.portfoliomaker.backend.repository;

import com.portfoliomaker.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}