package com.duy.assignment.eCommerceWebsitereview.repository;

import com.duy.assignment.eCommerceWebsitereview.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findUserByUsername(String username);

    void deleteUserByUsername(String username);
}
