package com.capgemini.dataaccess.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "user")
public class UserEntity extends AbstractEntity {

	@Column(length = 20)
	@NotNull
	private String name;

	@Column(length = 30)
	@NotNull
	private String surname;

	@Column(length = 50)
	@Email
	@NotNull
	private String email;

	@Column(length = 15)
	@NotNull
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phoneNumber;

	@ManyToMany(mappedBy = "wishList")
	private List<ItemEntity> wishListItems;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<ItemEntity> getWishListItems() {
		return wishListItems;
	}

	public void setWishListItems(List<ItemEntity> wishListItems) {
		this.wishListItems = wishListItems;
	}

}
