package com.capgemini.service;

import java.util.List;

import com.capgemini.to.ItemCardTo;

public interface ItemService {
	List<ItemCardTo> getItemsCardTo();
}
// TODO dodać jakis validation Service