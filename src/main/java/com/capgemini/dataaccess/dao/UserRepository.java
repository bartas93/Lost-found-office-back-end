package com.capgemini.dataaccess.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.dataaccess.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
