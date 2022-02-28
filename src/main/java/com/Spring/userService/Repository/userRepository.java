package com.Spring.userService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.userService.Entity.userEntity;

public interface userRepository extends JpaRepository<userEntity, Integer> {

}
