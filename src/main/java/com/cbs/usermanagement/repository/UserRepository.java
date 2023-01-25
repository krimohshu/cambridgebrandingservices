package com.cbs.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbs.usermanagement.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
