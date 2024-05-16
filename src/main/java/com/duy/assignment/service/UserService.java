package com.duy.assignment.service;

import com.duy.assignment.dto.UserDTO;
import com.duy.assignment.entity.User;

import java.util.List;

public interface UserService {
    List<UserDTO> findAllUsers();

    UserDTO findUserById(String uuid);

    UserDTO add(UserDTO userDTO);

    UserDTO update(UserDTO userDTO);

    void deleteById(String uuid);
}
