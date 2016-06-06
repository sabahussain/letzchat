package com.model;
import javax.persistence.*;

@Entity
public class Register {
	
	private String username;
	private String password;
	private String contact;
	private String email; 
	private String userType;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "Register [username=" + username + ", password=" + password + ", contact=" + contact + ", email=" + email
				+ ", userType=" + userType + "]";
	}
	
	
	
	
	

}
