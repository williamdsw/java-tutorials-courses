package com.williamdsw.behavioral.iterator.classes;

import java.util.List;
import java.util.ArrayList;

public class LinkedInIterator implements IProfileIterator {

	// FIELDS

	private LinkedIn linkedin;
	private String type;
	private String email;
	private int currentPosition = 0;
	private List<String> listEmails = new ArrayList<>();
	private List<Profile> listContacts = new ArrayList<>();

	// CONSTRUCTOR

	public LinkedInIterator(LinkedIn linkedin, String type, String email) {
		this.linkedin = linkedin;
		this.type = type;
		this.email = email;
	}

	// FUNCTIONS

	@Override
	public boolean hasNext() {
		lazyLoad();
		return currentPosition < listEmails.size();
	}

	@Override
	public Profile getNext() {
		if (!hasNext()) {
			return null;
		}

		String friendEmail = listEmails.get(currentPosition);
		Profile friendContact = listContacts.get(currentPosition);
		if (friendContact == null) {
			friendContact = linkedin.requestContactInfoFromLinkedInAPI(friendEmail);
			listContacts.set(currentPosition, friendContact);
		}

		currentPosition++;
		return friendContact;
	}

	@Override
	public void reset() {
		currentPosition = 0;
	}

	private void lazyLoad() {
		if (listEmails.size() == 0) {
			List<String> friends = linkedin.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
			for (String friend : friends) {
				this.listEmails.add(friend);
				this.listContacts.add(null);
			}
		}
	}
}