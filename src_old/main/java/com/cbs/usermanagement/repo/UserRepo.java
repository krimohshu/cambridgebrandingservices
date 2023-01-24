package com.cbs.usermanagement.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cbs.usermanagement.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	User findByName(String name);
}
