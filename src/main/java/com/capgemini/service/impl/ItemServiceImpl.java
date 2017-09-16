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
	public ItemTo getItemById(Long id) {
		return ItemMapper.mapToItemTo(itemRepository.findOne(id));
	}

	@Override
	public ItemCardTo save(ItemTo itemTo) {
		ItemEntity itemEntity = mapToEntity(itemTo);
		ItemEntity savedEntity = itemRepository.save(itemEntity);
		return ItemMapper.map(savedEntity);
	}

	private ItemEntity mapToEntity(ItemTo itemTo) {
		List<UserTo> wishListUsersTo = itemTo.getWishList();
		UserTo ownerTo = itemTo.getOwner();
		UserTo finderTo = itemTo.getFinder();
		UserEntity ownerEntity = userRepository.findOne(ownerTo.getId());
		UserEntity finderEntity = userRepository.findOne(finderTo.getId());
		List<UserEntity> wishListUserEntity = new ArrayList<>();
		wishListUsersTo.forEach(ut -> wishListUserEntity.add(userRepository.findOne(ut.getId())));
		ItemEntity itemEntity = ItemMapper.map(itemTo, ownerEntity, finderEntity, wishListUserEntity);
		return itemEntity;
	}

}
