package com.model;

public class Travel 
{
	private String username;
	private String email;
	@Override
	public String toString() {
		return "Travel [username=" + username + ", email=" + email + ", phone=" + phone + ", message=" + message
				+ ", getUsername()=" + getUsername() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone()
				+ ", getMessage()=" + getMessage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private int phone;
	private String message;
}
