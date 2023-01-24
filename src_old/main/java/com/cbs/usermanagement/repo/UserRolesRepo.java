package com.cbs.usermanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cbs.usermanagement.entity.Role;

@Repository
public interface UserRolesRepo extends JpaRepository<Role, Long> {
}
