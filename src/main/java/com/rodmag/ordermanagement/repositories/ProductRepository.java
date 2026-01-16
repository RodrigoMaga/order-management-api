package com.rodmag.ordermanagement.repositories;

import com.rodmag.ordermanagement.entities.Category;
import com.rodmag.ordermanagement.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
