package com.ckael.portfolio.model;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Contact implements Serializable{
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	Integer ContactId;
	
	@NotBlank(message="Name must be not null")
	@Size(min=4,message="Name size does contain more than 4 carachter")
	@Column
	String Name;
	
	@NotBlank(message="Firstname must be not null")
	@Size(min=4,message="Firstname size does contain more than 4 carachter")
	@Column
	String FirstName;
	
	
	@NotBlank(message="Post value most be not null")
	@Column
	String Post;
	
	@NotNull(message="Please insert value for Phone number")
	@Column 
	String Phone;
	
	@jakarta.validation.constraints.Email(message="Email value incorect ex: exemple@exemple.com")
	@NotNull(message="Insert mail value")
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
	
	public String getPost() {
		return Post;
	}
	public void setPost(String post) {
		Post = post;
	}
	public Contact(int contactId, String name, String firstName, String phone, String email, String facebook,
			String linkedin,String post) {
		super();
		ContactId = contactId;
		Name = name;
		FirstName = firstName;
		Phone = phone;
		Email = email;
		Facebook = facebook;
		Linkedin = linkedin;
		Post = post;
	}
	
	public Contact() {
		super();
		
	}
	
	
	
	
	

}
