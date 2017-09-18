package com.capgemini.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dataaccess.dao.ItemRepository;
import com.capgemini.dataaccess.dao.UserRepository;
import com.capgemini.dataaccess.entity.ItemEntity;
import com.capgemini.dataaccess.entity.UserEntity;
import com.capgemini.dataaccess.enums.ItemStatus;
import com.capgemini.mappers.ItemMapper;
import com.capgemini.service.ItemService;
import com.capgemini.to.ItemCardTo;
import com.capgemini.to.ItemTableTo;
import com.capgemini.to.ItemTo;
import com.capgemini.to.UserTo;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<ItemCardTo> getItemsCardTo() {
		return ItemMapper.map(itemRepository.findByItemStatus(ItemStatus.FOUND));
	}

	@Override
	public List<ItemTableTo> getItemsTableToLost() {
		return ItemMapper.mapToItemsTableTo(itemRepository.findByItemStatus(ItemStatus.LOST));
	}

	@Override
	public List<ItemTableTo> getItemsTableToFound() {
		return ItemMapper.mapToItemsTableTo(itemRepository.findByItemStatus(ItemStatus.FOUND));
	}

	@Override
	public ItemTo getItemById(Long id) {
		return ItemMapper.mapToItemTo(itemRepository.findOne(id));
	}

	@Override
	public ItemTo save(ItemTo itemTo) {
		ItemEntity itemEntity = mapToEntity(itemTo);
		itemRepository.save(itemEntity);
		return itemTo;
	}

	private ItemEntity mapToEntity(ItemTo itemTo) {
		List<UserTo> wishListUsersTo = itemTo.getWishList();
		UserEntity ownerEntity = getOwnerEntity(itemTo);
		UserEntity finderEntity = getFinderEntity(itemTo);
		List<UserEntity> wishListUserEntity = new ArrayList<>();
		wishListUsersTo.forEach(ut -> wishListUserEntity.add(userRepository.findOne(ut.getId())));
		ItemEntity itemEntity = ItemMapper.map(itemTo, ownerEntity, finderEntity, wishListUserEntity);
		return itemEntity;
	}

	private UserEntity getFinderEntity(ItemTo itemTo) {
		UserEntity finderEntity;
		if (itemTo.getFinder() != null) {
			UserTo finderTo = itemTo.getFinder();
			finderEntity = userRepository.findOne(finderTo.getId());
		} else {
			finderEntity = null;
		}
		return finderEntity;
	}

	private UserEntity getOwnerEntity(ItemTo itemTo) {
		UserEntity ownerEntity;
		if (itemTo.getOwner() != null) {
			UserTo ownerTo = itemTo.getOwner();
			ownerEntity = userRepository.findOne(ownerTo.getId());
		} else {
			ownerEntity = null;
		}
		return ownerEntity;
	}

}
