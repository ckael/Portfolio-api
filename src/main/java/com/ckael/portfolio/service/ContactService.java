package com.ckael.portfolio.service;

import java.util.List;

import com.ckael.portfolio.model.Contact;

public interface ContactService {
	Contact saveContact(Contact c);
	Contact updateContact(Contact c);
	void deleteContactById(Integer Id);
	void deleteContact(Contact c);
	Contact findContactById(Integer Id);
	List<Contact> findAllContact();
}
