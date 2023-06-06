package com.babik.pet.toyCommerce.repository;

import com.babik.pet.toyCommerce.entity.user.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Integer, User> {
    Optional<User> findByEmail(String email);
}
