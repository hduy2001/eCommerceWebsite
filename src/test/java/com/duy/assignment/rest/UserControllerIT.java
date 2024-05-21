package com.duy.assignment.rest;

import com.duy.assignment.ECommerceApplication;
import com.duy.assignment.dto.UserDTO;
import com.duy.assignment.entity.User;
import com.duy.assignment.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.http.HttpMethod.GET;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = ECommerceApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@AutoConfigureMockMvc

class UserControllerIT {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;

    @Test
    void getAllUsers() throws Exception {
        // Given
        User user =  new User();
        user.setUsername("Khanh");
        user.setPassword("Khanh");
        user.setEmail("Khanh");
        user.setFullName("nnguyen duy khanh");
        userRepository.save(user);

        // When
        mockMvc.perform(request(GET, "/api/v1/admin/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$..username").value("Khanh"));



    }

    @Autowired
    private UserController userController;

    @Test
    void serviceTest(){
        User user =  new User();
        user.setUsername("Khanh");
        user.setPassword("Khanh");
        user.setEmail("Khanh");
        user.setFullName("nnguyen duy khanh");
        userRepository.save(user);

        List<UserDTO> userDTOS = userController.getAllUsers();
    }
}