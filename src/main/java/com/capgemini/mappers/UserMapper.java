package com.capgemini.mappers;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.dataaccess.entity.UserEntity;
import com.capgemini.to.UserTo;

public class UserMapper {
	public static UserTo map(UserEntity userEntity) {
		if (userEntity == null) {
			return null;
		}
		return new UserTo(userEntity.getId(), userEntity.getName(), userEntity.getSurname(), userEntity.getEmail(),
				userEntity.getPhoneNumber(), userEntity.getWishListItems().size());
	}

	public static List<UserTo> map(List<UserEntity> listOfUserEntity) {
		List<UserTo> usersTo = new ArrayList<>();
		listOfUserEntity.forEach(u -> usersTo.add(UserMapper.map(u)));
		return usersTo;
	}

}
