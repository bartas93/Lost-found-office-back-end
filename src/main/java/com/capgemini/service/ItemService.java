package com.capgemini.service;

import java.util.List;

import com.capgemini.to.ItemCardTo;
import com.capgemini.to.ItemTableTo;
import com.capgemini.to.ItemTo;

public interface ItemService {

	List<ItemCardTo> getItemsCardTo();

	List<ItemTableTo> getItemsTableToFound();

	ItemTo getItemById(Long id);

	ItemTo save(ItemTo itemTo);

	List<ItemTableTo> getItemsTableToLost();
}
