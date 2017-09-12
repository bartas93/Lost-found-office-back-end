package com.capgemini.to;

import java.time.LocalDate;

import com.capgemini.dataaccess.enums.Category;
import com.capgemini.dataaccess.enums.ItemStatus;

public class ItemTableTo extends AbstractTo {

	private String name;
	private Category category;
	private ItemStatus itemStatus;
	private LocalDate notificationDate;
	private Float weight;
	private String color;

	public ItemTableTo() {
	}

	public ItemTableTo(Long id, String name, Category category, ItemStatus itemStatus, LocalDate notificationDate,
			Float weight, String color) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.itemStatus = itemStatus;
		this.notificationDate = notificationDate;
		this.weight = weight;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
