package com.capgemini.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.dataaccess.entity.UserEntity;
import com.capgemini.dataaccess.enums.ItemStatus;
import com.capgemini.to.UserTo;

public class UserMapper {
	public static UserTo map(UserEntity userEntity) {
		if (userEntity == null) {
			return null;
		}
		int size = userEntity.getWishListItems().stream().filter(item -> item.getItemStatus() != ItemStatus.COMPLETED)
				.collect(Collectors.toList()).size();
		return new UserTo(userEntity.getId(), userEntity.getName(), userEntity.getSurname(), userEntity.getEmail(),
				userEntity.getPhoneNumber(), size);
	}

	public static List<UserTo> map(List<UserEntity> listOfUserEntity) {
		List<UserTo> usersTo = new ArrayList<>();
		listOfUserEntity.forEach(u -> usersTo.add(UserMapper.map(u)));
		return usersTo;
	}

}
