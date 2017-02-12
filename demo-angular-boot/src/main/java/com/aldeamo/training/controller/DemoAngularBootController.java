package com.aldeamo.training.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aldeamo.training.entity.Contact;
import com.aldeamo.training.service.ContactService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class DemoAngularBootController {

	private static final Logger logger = LoggerFactory.getLogger(DemoAngularBootController.class);
	
	@RequestMapping(value = "/api/contactList", method = RequestMethod.GET, produces = "application/json")
		@ApiOperation(value = "getContactList", nickname = "getContactList")
		@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = Contact.class),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Failure")
			})
	public List<Contact> returnContactList(){
		
		logger.info("Requested entire contact list");
		
		return new ContactService().getContactList();
		
	}
}
