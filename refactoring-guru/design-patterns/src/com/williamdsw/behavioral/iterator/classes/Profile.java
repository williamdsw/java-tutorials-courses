package com.williamdsw.behavioral.iterator.classes;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Profile {

	// FIELDS

	private String name;
	private String email;
	private Map<String, List<String>> contacts = new HashMap<>();

	// CONSTRUCTOR

	public Profile(String name, String email, String... contacts) {
		super();
		this.name = name;
		this.email = email;

		for (String contact : contacts) {
			String[] parts = contact.split(":");
			String contactType = "friend";
			String contactEmail = "";

			if (parts.length == 1) {
				contactEmail = parts[0];
			} else {
				contactType = parts[0];
				contactEmail = parts[1];
			}

			if (!this.contacts.containsKey(contactType)) {
				this.contacts.put(contactType, new ArrayList<>());
			}

			this.contacts.get(contactType).add(contactEmail);
		}
	}

	// GETTERS

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	// FUNCTIONS

	public List<String> getContacts(String contactType) {
		if (!this.contacts.containsKey(contactType)) {
			this.contacts.put(contactType, new ArrayList<>());
		}

		return contacts.get(contactType);
	}
}