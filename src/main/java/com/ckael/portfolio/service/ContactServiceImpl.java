package com.ckael.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckael.portfolio.model.Contact;
import com.ckael.portfolio.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository Rep;
	@Override
	public Contact saveContact(Contact c) {
				return Rep.save(c);
	}

	@Override
	public Contact updateContact(Contact c) {
		
		return Rep.save(c);
	}

	@Override
	public void deleteContactById(Integer Id) {
		Rep.deleteById(Id);

	}

	@Override
	public void deleteContact(Contact c) {
	Rep.delete(c);

	}
	@Override	
	public Contact findContactById(Integer Id) {
		
		return Rep.findById(Id).get();
		
	}

	@Override
	public List<Contact> findAllContact() {
		
		return Rep.findAll();
	}

}
