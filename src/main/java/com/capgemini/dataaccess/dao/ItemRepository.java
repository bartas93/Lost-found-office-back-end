package com.capgemini.dataaccess.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.dataaccess.entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {

}
