package com.williamdsw.behavioral.iterator.classes;

public class SocialSpammer {

	// FIELDS

	private ISocialNetwork network;
	private IProfileIterator iterator;

	// CONSTRUCTOR

	public SocialSpammer(ISocialNetwork network) {
		this.network = network;
	}

	// FUNCTIONS

	private void sendMessage(String email, String message) {
		String output = "Sent message to: %1s.\nMessage body: %2s";
		output = String.format(email, message);
		System.out.println(output);
	}

	public void sendSpamToFriends(String email, String message) {
		System.out.println("\nIterating over friends...\n");
		iterator = network.createFriendsIterator(email);
		while (iterator.hasNext()) {
			Profile profile = iterator.getNext();
			sendMessage(profile.getEmail(), message);
		}
	}

	public void sendSpamToCoworkers(String email, String message) {
		System.out.println("\nIterating over coworkers...\n");
		iterator = network.createCoworkersIterator(email);
		while (iterator.hasNext()) {
			Profile profile = iterator.getNext();
			sendMessage(profile.getEmail(), message);
		}
	}
}