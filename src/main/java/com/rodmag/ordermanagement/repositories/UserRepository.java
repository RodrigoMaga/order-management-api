package com.rodmag.ordermanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodmag.ordermanagement.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
