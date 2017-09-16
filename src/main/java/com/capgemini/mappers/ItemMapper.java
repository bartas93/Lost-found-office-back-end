package com.capgemini.mappers;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.dataaccess.entity.ItemEntity;
import com.capgemini.dataaccess.entity.UserEntity;
import com.capgemini.to.ItemCardTo;
import com.capgemini.to.ItemTo;

public class ItemMapper {

	public static List<ItemCardTo> map(List<ItemEntity> items) {
		List<ItemCardTo> itemsTo = new ArrayList<>();
		items.forEach(i -> itemsTo.add(map(i)));
		return itemsTo;
	}

	public static ItemCardTo map(ItemEntity item) {
		if (item == null) {
			return null;
		}
		return new ItemCardTo(item.getId(), item.getName(), item.getDescription(), item.getCategory(),
				item.getNotificationDate(), item.getPhotoUrl(), UserMapper.map(item.getWishList()));
	}

	public static ItemTo mapToItemTo(ItemEntity item) {
		return new ItemTo(item.getId(), item.getName(), item.getDescription(), item.getCategory(), item.getItemStatus(),
				item.getNotificationDate(), item.getRealizationDate(), item.getWeight(), item.getColor(),
				item.getPhotoUrl(), item.getQuantityOfStars(), UserMapper.map(item.getOwner()),
				UserMapper.map(item.getFinder()), UserMapper.map(item.getWishList()));
	}

	public static ItemEntity map(ItemTo itemTo, UserEntity ownerEntity, UserEntity finderEntity,
			List<UserEntity> wishListUserEntity) {
		ItemEntity item = new ItemEntity(itemTo.getName(), itemTo.getDescription(), itemTo.getCategory(),
				itemTo.getItemStatus(), itemTo.getNotificationDate(), itemTo.getRealizationDate(), itemTo.getWeight(),
				itemTo.getColor(), itemTo.getPhotoUrl(), itemTo.getQuantityOfStars(), ownerEntity, finderEntity,
				wishListUserEntity);
		if (itemTo.getId() != null) {
			item.setId(itemTo.getId());
		}
		return item;
	}

}
