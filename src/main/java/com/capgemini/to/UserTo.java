package com.capgemini.to;

public class UserTo extends AbstractTo {

	private String name;
	private String surname;
	private String email;
	private String phoneNumber;
	private int inWishLists;

	public UserTo(Long id, String name, String surname, String email, String phoneNumber, int inWishLists) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.inWishLists = inWishLists;
	}

	public UserTo() {
	}

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

	public int getInWishlists() {
		return inWishLists;
	}

	public void setInWishlists(int inWishlists) {
		this.inWishLists = inWishlists;
	}

}
