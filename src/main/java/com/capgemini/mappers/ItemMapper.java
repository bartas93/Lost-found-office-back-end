package com.capgemini.mappers;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.dataaccess.entity.ItemEntity;
import com.capgemini.to.ItemCardTo;

public class ItemMapper {

	public static List<ItemCardTo> map(List<ItemEntity> items) {
		List<ItemCardTo> itemsTo = new ArrayList<>();
		items.forEach(i -> itemsTo.add(map(i)));
		return itemsTo;
	}

	public static ItemCardTo map(ItemEntity item) {
		return new ItemCardTo(item.getId(), item.getName(), item.getDescription(), item.getCategory(),
				item.getNotificationDate(), item.getPhotoUrl(), UserMapper.map(item.getWishList()));
	}

}
