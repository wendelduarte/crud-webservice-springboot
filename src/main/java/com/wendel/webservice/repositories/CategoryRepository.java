package com.wendel.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendel.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
