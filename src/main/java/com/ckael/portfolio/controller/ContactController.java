package com.ckael.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ckael.portfolio.model.Contact;
import com.ckael.portfolio.service.ContactServiceImpl;

@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	ContactServiceImpl Service;
	
	@PostMapping("/addContact")
	public Contact addContact(@RequestBody()Contact c) 
	{
		
		return Service.saveContact(c);
			
	}
	@PostMapping("/editContact")
	public Contact editContact(@RequestBody()Contact c)
	{
		
		return Service.updateContact(c);
	}
	
	@GetMapping("/findContact/{Id}")
	public Contact findContactById( @PathVariable Integer Id) 
	{
	
		return Service.findContactById(Id);
	}
	@GetMapping("/listContact")
	public List<Contact> getAllContacts()
	{	
		return Service.findAllContact();
	}
	@GetMapping("/deleteContact/Id/{Id}")
	public void deleteContact(@PathVariable("Id") Integer Id) 
	{
		
		Service.deleteContactById(Id);
	}
}
