package com.capgemini.dataaccess.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.capgemini.dataaccess.enums.Category;
import com.capgemini.dataaccess.enums.ItemStatus;

@Entity
@Table(name = "item")
public class ItemEntity extends AbstractEntity {

	@Column(length = 80)
	@NotNull
	private String name;

	@Lob
	private String description;

	@Enumerated(EnumType.STRING)
	private Category category;

	@NotNull
	@Enumerated(EnumType.STRING)
	private ItemStatus itemStatus;

	private LocalDate notificationDate;
	private LocalDate realizationDate;
	private Float weight;
	private String color;
	private String photoUrl;
	@Column(columnDefinition = "int default -1")
	private int quantityOfStars = -1;

	@ManyToOne
	@JoinColumn(name = "id_user_owner")
	private UserEntity owner;

	@ManyToOne
	@JoinColumn(name = "id_user_finder")
	private UserEntity finder;

	@ManyToMany
	@JoinTable(joinColumns = { @JoinColumn(name = "id_item") }, inverseJoinColumns = { @JoinColumn(name = "id_user") })
	private List<UserEntity> wishList;

	public ItemEntity(String name, String description, Category category, ItemStatus itemStatus,
			LocalDate notificationDate, LocalDate realizationDate, Float weight, String color, String photoUrl,
			Integer quantityOfStars, UserEntity owner, UserEntity finder, List<UserEntity> wishList) {
		super();
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

	public ItemEntity() {
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

	public int getQuantityOfStars() {
		return quantityOfStars;
	}

	public void setQuantityOfStars(int quantityOfStars) {
		this.quantityOfStars = quantityOfStars;
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

	public UserEntity getOwner() {
		return owner;
	}

	public void setOwner(UserEntity owner) {
		this.owner = owner;
	}

	public UserEntity getFinder() {
		return finder;
	}

	public void setFinder(UserEntity finder) {
		this.finder = finder;
	}

	public List<UserEntity> getWishList() {
		return wishList;
	}

	public void setWishList(List<UserEntity> wishList) {
		this.wishList = wishList;
	}

}
