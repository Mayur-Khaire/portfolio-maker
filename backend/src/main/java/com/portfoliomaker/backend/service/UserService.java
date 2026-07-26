package com.portfoliomaker.backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.portfoliomaker.backend.dto.UserDTO;
import com.portfoliomaker.backend.entity.User;
import com.portfoliomaker.backend.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // Convert Entity -> DTO
    private UserDTO convertToDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

    // CREATE
    public UserDTO register(User user) {

        // Encrypt password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        User savedUser = userRepository.save(user);

        return convertToDTO(savedUser);
    }

    // READ ALL
    public List<UserDTO> getAllUsers() {

        return userRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // READ BY ID
    public UserDTO getUserById(Long id) {

        User user = userRepository.findById(id).orElse(null);

        if (user == null) {
            return null;
        }

        return convertToDTO(user);
    }

    // UPDATE
    public UserDTO updateUser(Long id, User updatedUser) {

        User existingUser = userRepository.findById(id).orElse(null);

        if (existingUser == null) {
            return null;
        }

        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());

        // Encrypt new password before saving
        existingUser.setPassword(
                passwordEncoder.encode(updatedUser.getPassword())
        );

        User savedUser = userRepository.save(existingUser);

        return convertToDTO(savedUser);
    }

    // DELETE
    public void deleteUser(Long id) {

        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            userRepository.delete(user);
        }
    }
}