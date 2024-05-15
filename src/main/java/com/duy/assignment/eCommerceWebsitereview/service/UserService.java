package com.duy.assignment.eCommerceWebsitereview.service;

import com.duy.assignment.eCommerceWebsitereview.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User findUserByUsername(String username);

    User save(User user);

    void  deleteByUsername(String username);
}
