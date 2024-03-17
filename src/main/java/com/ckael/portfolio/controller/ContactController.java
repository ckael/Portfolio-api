package com.ckael.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Contact> addContact(@RequestBody()Contact c) 
	{	
		Contact contact = Service.saveContact(c);
		return new ResponseEntity<>(contact,HttpStatus.CREATED);			
	}
	
	@PostMapping("/editContact")
	public ResponseEntity<Contact> editContact(@RequestBody()Contact c)
	{	
		Contact contact = Service.updateContact(c);
		return ResponseEntity.accepted().body(contact);
	}
	
	@GetMapping("/findContact/{Id}")
	public ResponseEntity<Contact> findContactById( @PathVariable Integer Id) 
	{
		Contact contact = Service.findContactById(Id);
		return ResponseEntity.ok(contact);
	}
	
	@GetMapping("/listContact")
	public ResponseEntity<List<Contact>> getAllContacts()
	{	
		return new ResponseEntity<>(Service.findAllContact(), HttpStatus.OK); 
	}
	
	@GetMapping("/deleteContact/Id/{Id}")
	public ResponseEntity<String> deleteContact(@PathVariable("Id") Integer Id) 
	{
		Service.deleteContactById(Id);
		 return ResponseEntity.ok("Contact \t"+Id+"\t deleted successfuly");
	}
}
