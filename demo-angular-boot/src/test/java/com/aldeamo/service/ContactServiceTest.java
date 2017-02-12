package com.aldeamo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import com.aldeamo.training.entity.Contact;
import com.aldeamo.training.service.ContactService;

public class ContactServiceTest {

	@Test
	public void queryContactListTest(){
		// Arrange
		ContactService contactService = new ContactService();
		
		// Act
		List<Contact> contactList = contactService.getContactList();
		
		// Assert
		assertThat(contactList).hasSize(1);
	}
}
