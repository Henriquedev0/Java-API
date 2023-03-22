package com.algoSS.usersqq.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algoSS.usersqq.entities.User;

public interface  UserRepository extends JpaRepository<User, Long> {

}
