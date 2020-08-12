package com.wendel.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendel.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
