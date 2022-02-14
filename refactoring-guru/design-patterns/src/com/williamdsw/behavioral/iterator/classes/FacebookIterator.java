package com.williamdsw.behavioral.iterator.classes;

import java.util.List;
import java.util.ArrayList;

public class FacebookIterator implements IProfileIterator {

	// FIELDS

	private Facebook facebook;
	private String type;
	private String email;
	private int currentPosition = 0;
	private List<String> listEmails = new ArrayList<>();
	private List<Profile> listProfiles = new ArrayList<>();

	// CONSTRUCTOR

	public FacebookIterator(Facebook facebook, String type, String email) {
		this.facebook = facebook;
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
		Profile friendProfile = listProfiles.get(currentPosition);
		if (friendProfile == null) {
			friendProfile = facebook.requestProfileFromFacebook(friendEmail);
			listProfiles.set(currentPosition, friendProfile);
		}

		currentPosition++;
		return friendProfile;
	}

	@Override
	public void reset() {
		currentPosition = 0;
	}

	private void lazyLoad() {
		if (listEmails.size() == 0) {
			List<String> friends = facebook.requestProfileFriendsFroFacebook(this.email, this.type);
			for (String friend : friends) {
				this.listEmails.add(friend);
				this.listProfiles.add(null);
			}
		}
	}
}