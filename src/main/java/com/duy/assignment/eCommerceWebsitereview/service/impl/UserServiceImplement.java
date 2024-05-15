package com.duy.assignment.eCommerceWebsitereview.service.impl;

import com.duy.assignment.eCommerceWebsitereview.entity.User;
import com.duy.assignment.eCommerceWebsitereview.repository.UserRepository;
import com.duy.assignment.eCommerceWebsitereview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplement implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByUsername(String username) {
        Optional<User> existUser = userRepository.findUserByUsername(username);
        User user;
        if (existUser.isPresent()) {
            user = existUser.get();
        } else {
            throw new RuntimeException("Did not find user with username - " + username);
        }
        return user;
    }

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteByUsername(String username) {
        userRepository.deleteUserByUsername(username);
    }

}
