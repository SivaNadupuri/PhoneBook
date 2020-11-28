/**
 * 
 */
package com.phonebook.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phonebook.entity.Contact;
import com.phonebook.service.PhoneBookService;

/**
 * @author siva
 *
 */

@Service
public class PhoneBookServiceImpl implements PhoneBookService {

	@Override
	public boolean saveContactInfo(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String addContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteContactById(Long contactId) {
		// TODO Auto-generated method stub
		return null;
	}

}
