package com.shravani.spring.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.shravani.spring.data.entities.Product;

public interface ProductRepositary extends CrudRepository<Product, Long> {

}
