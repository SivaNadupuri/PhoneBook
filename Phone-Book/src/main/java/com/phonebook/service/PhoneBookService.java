/**
 * 
 */
package com.phonebook.service;

import java.util.List;

import com.phonebook.entity.Contact;

/**
 * @author siva
 *
 */
public interface PhoneBookService {
	
	 boolean saveContactInfo(Contact contact);
	 
	 String addContact(Contact contact);
	 
	 List<Contact> getAllContacts();
	 
	 Contact updateContact(Contact contact);
	 
	 String deleteContactById(Long contactId);
	
	
	

}
