package com.wendel.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendel.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
