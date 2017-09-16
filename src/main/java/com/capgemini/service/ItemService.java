package com.capgemini.service;

import java.util.List;

import com.capgemini.to.ItemCardTo;
import com.capgemini.to.ItemTo;

public interface ItemService {
	List<ItemCardTo> getItemsCardTo();

	ItemTo getItemById(Long id);

	ItemCardTo save(ItemTo itemTo);
}
