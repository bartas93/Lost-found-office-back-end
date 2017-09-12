package com.capgemini.to;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.dataaccess.enums.Category;
import com.capgemini.dataaccess.enums.ItemStatus;

public class ItemTo extends AbstractTo {

	private String name;
	private String description;
	private Category category;
	private ItemStatus itemStatus;
	private LocalDate notificationDate;
	private LocalDate realizationDate;
	private Float weight;
	private String color;
	private String photoUrl;
	private Integer quantityOfStars;
	private UserTo owner;
	private UserTo finder;
	private List<UserTo> wishList;

	public ItemTo() {
	}

	public ItemTo(Long id, String name, String description, Category category, ItemStatus itemStatus,
			LocalDate notificationDate, LocalDate realizationDate, Float weight, String color, String photoUrl,
			Integer quantityOfStars, UserTo owner, UserTo finder, List<UserTo> wishList) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.itemStatus = itemStatus;
		this.notificationDate = notificationDate;
		this.realizationDate = realizationDate;
		this.weight = weight;
		this.color = color;
		this.photoUrl = photoUrl;
		this.quantityOfStars = quantityOfStars;
		this.owner = owner;
		this.finder = finder;
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

	public ItemStatus getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(ItemStatus itemStatus) {
		this.itemStatus = itemStatus;
	}

	public LocalDate getNotificationDate() {
		return notificationDate;
	}

	public void setNotificationDate(LocalDate notificationDate) {
		this.notificationDate = notificationDate;
	}

	public LocalDate getRealizationDate() {
		return realizationDate;
	}

	public void setRealizationDate(LocalDate realizationDate) {
		this.realizationDate = realizationDate;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Integer getQuantityOfStars() {
		return quantityOfStars;
	}

	public void setQuantityOfStars(Integer quantityOfStars) {
		this.quantityOfStars = quantityOfStars;
	}

	public UserTo getOwner() {
		return owner;
	}

	public void setOwner(UserTo owner) {
		this.owner = owner;
	}

	public UserTo getFinder() {
		return finder;
	}

	public void setFinder(UserTo finder) {
		this.finder = finder;
	}

	public List<UserTo> getWishList() {
		return wishList;
	}

	public void setWishList(List<UserTo> wishList) {
		this.wishList = wishList;
	}

}
