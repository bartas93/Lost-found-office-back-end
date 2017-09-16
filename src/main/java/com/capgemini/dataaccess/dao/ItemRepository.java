package com.capgemini.dataaccess.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.dataaccess.entity.ItemEntity;
import com.capgemini.dataaccess.enums.ItemStatus;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {

	List<ItemEntity> findByItemStatus(ItemStatus itemStatus);

}
