package com.ckael.portfolio.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact implements Serializable{
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	Integer ContactId;
	@Column
	String Name;
	@Column
	String FirstName;
	@Column
	String Post;
	@Column 
	String Phone;
	@Column
	String Email;
	@Column
	String Facebook;
	@Column 
	String Linkedin;
	public int getContactId() {
		return ContactId;
	}
	public void setContactId(int contactId) {
		ContactId = contactId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFacebook() {
		return Facebook;
	}
	public void setFacebook(String facebook) {
		Facebook = facebook;
	}
	public String getLinkedin() {
		return Linkedin;
	}
	public void setLinkedin(String linkedin) {
		Linkedin = linkedin;
	}
	public Contact(int contactId, String name, String firstName, String phone, String email, String facebook,
			String linkedin) {
		super();
		ContactId = contactId;
		Name = name;
		FirstName = firstName;
		Phone = phone;
		Email = email;
		Facebook = facebook;
		Linkedin = linkedin;
	}
	
	public Contact() {
		super();
		
	}
	
	
	

}
