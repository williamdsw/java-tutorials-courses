package com.williamdsw.behavioral.iterator.classes;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements ISocialNetwork {

	// FIELDS

	private List<Profile> listProfiles = new ArrayList<>();

	// CONSTRUCTOR

	public Facebook(List<Profile> listChache) {
		if (listChache != null) {
			this.listProfiles = listChache;
		}
	}

	// FUNCTIONS

	@Override
	public IProfileIterator createFriendsIterator(String email) {
		return new FacebookIterator(this, "friends", email);
	}

	@Override
	public IProfileIterator createCoworkersIterator(String email) {
		return new FacebookIterator(this, "coworkers", email);
	}

	private void simulateNetworkLatency() {
		try {
			Thread.sleep(2500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Profile findProfile(String email) {
		for (Profile profile : listProfiles) {
			if (profile.getEmail().equals(email)) {
				return profile;
			}
		}

		return null;
	}

	public Profile requestProfileFromFacebook(String email) {
		simulateNetworkLatency();

		String message = "Facebook: Loading profile '%1s' over the network...";
		message = String.format(message, email);
		System.out.println(message);

		return findProfile(email);
	}

	public List<String> requestProfileFriendsFroFacebook(String email, String contactType) {
		simulateNetworkLatency();

		String message = "Facebook: Loading profile '%1s' list of '%2s' over the network...";
		message = String.format(message, contactType, email);
		System.out.println(message);

		Profile profile = findProfile(email);
		if (profile != null) {
			return profile.getContacts(contactType);
		}

		return null;
	}
}