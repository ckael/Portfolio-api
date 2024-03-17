package com.ckael.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ckael.portfolio.repository.ContactRepository;
import com.ckael.portfolio.service.ContactServiceImpl;
import com.ckael.portfolio.model.Contact;

@SpringBootTest
class portfolioApplicationTests {

	@Autowired
	ContactRepository rep;
	@Autowired 
	ContactServiceImpl impl;
	
	
	@Test
	void getContact() 
	{
		Contact c = impl.findContactById(14);
		System.out.println(c.toString()) ;
	}
	

}
