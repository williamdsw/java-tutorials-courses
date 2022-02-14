package com.williamdsw.behavioral.iterator.classes;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements ISocialNetwork {

	// FIELDS

	private List<Profile> listContacts = new ArrayList<>();

	// CONSTRUCTOR

	public LinkedIn(List<Profile> listChache) {
		if (listChache != null) {
			this.listContacts = listChache;
		}
	}

	// FUNCTIONS

	@Override
	public IProfileIterator createFriendsIterator(String email) {
		return new LinkedInIterator(this, "friends", email);
	}

	@Override
	public IProfileIterator createCoworkersIterator(String email) {
		return new LinkedInIterator(this, "coworkers", email);
	}

	private void simulateNetworkLatency() {
		try {
			Thread.sleep(2500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Profile findContact(String email) {
		for (Profile profile : listContacts) {
			if (profile.getEmail().equals(email)) {
				return profile;
			}
		}

		return null;
	}

	public Profile requestContactInfoFromLinkedInAPI(String email) {
		simulateNetworkLatency();

		String message = "Linkedin: Loading profile '%1s' over the network...";
		message = String.format(message, email);
		System.out.println(message);

		return findContact(email);
	}

	public List<String> requestRelatedContactsFromLinkedInAPI(String email, String contactType) {
		simulateNetworkLatency();

		String message = "LinkedIn: Loading profile '%1s' list of '%2s' over the network...";
		message = String.format(message, contactType, email);
		System.out.println(message);

		Profile profile = findContact(email);
		if (profile != null) {
			return profile.getContacts(contactType);
		}

		return null;
	}
}