package com.ckael.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ckael.portfolio.repository.ContactRepository;
import com.ckael.portfolio.model.Contact;

@SpringBootTest
class KlApplicationTests {

	@Autowired
	ContactRepository rep;
	
	
	@Test
	void addContact() {
		Contact c = new Contact(1,"RANAIVOMANANA","Riantsoa Ckaël","032 99 072 18","Ranckael6@gmail.com","Riantsoa Ckael","Riantsoa");
	}
	

}
