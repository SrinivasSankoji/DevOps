package com.technotowntechie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technotowntechie.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
