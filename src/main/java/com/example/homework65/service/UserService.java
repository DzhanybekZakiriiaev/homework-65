package com.example.homework65.service;

import com.example.homework65.entity.User;
import com.example.homework65.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    @Autowired

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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
    public User findById(Integer id) {
        Optional<User> userOptional = userRepository.findById(Long.valueOf(id));
        return userOptional.orElse(null);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
