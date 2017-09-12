package com.capgemini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dataaccess.dao.ItemRepository;
import com.capgemini.dataaccess.enums.ItemStatus;
import com.capgemini.mappers.ItemMapper;
import com.capgemini.service.ItemService;
import com.capgemini.to.ItemCardTo;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public List<ItemCardTo> getItemsCardTo() {
		return ItemMapper.map(itemRepository.findByItemStatus(ItemStatus.FOUND));
	}

}
