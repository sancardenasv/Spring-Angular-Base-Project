package com.aldeamo.training.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aldeamo.training.entity.Contact;
import com.aldeamo.training.service.ContactService;

@RestController
public class DemoAngularBootController {

	
	@RequestMapping(value = "/api/contactList", method = RequestMethod.GET)
	public List<Contact> returnContactList(){
		
		return new ContactService().getContactList();
		
	}
}
