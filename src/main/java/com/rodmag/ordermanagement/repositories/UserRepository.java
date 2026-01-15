package com.rodmag.ordermanagement.repositories;

import com.rodmag.ordermanagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
