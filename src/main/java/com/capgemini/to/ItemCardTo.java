package com.capgemini.to;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.dataaccess.enums.Category;

public class ItemCardTo extends AbstractTo {

	private String name;
	private String description;
	private Category category;
	private LocalDate notificationDate;
	private String photoUrl;
	private List<UserTo> wishList;

	public ItemCardTo() {
	}

	public ItemCardTo(Long id, String name, String description, Category category, LocalDate notificationDate,
			String photoUrl, List<UserTo> wishList) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.notificationDate = notificationDate;
		this.photoUrl = photoUrl;
		this.wishList = wishList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDate getNotificationDate() {
		return notificationDate;
	}

	public void setNotificationDate(LocalDate notificationDate) {
		this.notificationDate = notificationDate;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public List<UserTo> getWishList() {
		return wishList;
	}

	public void setWishList(List<UserTo> wishList) {
		this.wishList = wishList;
	}

}
