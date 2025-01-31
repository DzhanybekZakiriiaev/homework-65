package com.example.homework65.service;

import com.example.homework65.entity.User;
import com.example.homework65.exception.DuplicateEmailException;
import com.example.homework65.exception.UserNotFoundException;
import com.example.homework65.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public User userByName(String name){
        User byUserName = userRepository.findByName(name);
        return byUserName;
    }

    @Transactional(readOnly = true)
    public User userByEmail(String email){
        User byEmail = userRepository.findByEmail(email);
        return byEmail;
    }
    @Transactional(readOnly = true)
    public boolean existsByEmail(String email){
        boolean exists = userRepository.existsByEmail(email);
        return exists;
    }
    public User findById(Integer id) {
        Optional<User> userOptional = userRepository.findById(Long.valueOf(id));
        return userOptional.orElseThrow(() -> new UserNotFoundException("User not found with id " + id));
    }


    public void saveUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new DuplicateEmailException("User with email " + user.getEmail() + " already exists");
        }
        userRepository.save(user);
    }


    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
