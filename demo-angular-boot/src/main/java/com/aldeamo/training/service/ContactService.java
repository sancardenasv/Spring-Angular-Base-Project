package com.aldeamo.training.service;

import java.util.ArrayList;
import java.util.List;

import com.aldeamo.training.entity.Contact;

public class ContactService {

	public List<Contact> getContactList() {
		List<Contact> contactList = new ArrayList<>();
		
		Contact contact = new Contact(1, "Santiago Cardenas", "3118714354", "Calle 146 13-27", "santiago.cardenas@aldeamo.com", "Administrator");
		contactList.add(contact);
		
		return contactList;
	}

}
