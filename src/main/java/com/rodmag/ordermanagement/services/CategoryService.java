package com.rodmag.ordermanagement.services;

import com.rodmag.ordermanagement.entities.Category;
import com.rodmag.ordermanagement.entities.User;
import com.rodmag.ordermanagement.repositories.CategoryRepository;
import com.rodmag.ordermanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
