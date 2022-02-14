package com.williamdsw.behavioral.iterator.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.williamdsw.behavioral.iterator.classes.Facebook;
import com.williamdsw.behavioral.iterator.classes.ISocialNetwork;
import com.williamdsw.behavioral.iterator.classes.LinkedIn;
import com.williamdsw.behavioral.iterator.classes.Profile;
import com.williamdsw.behavioral.iterator.classes.SocialSpammer;

public class IteratorDemo {

	public static void iteratorDemo() {
		System.out.println("Please specify social network to target spam tool:");
		System.out.println("1. Facebook");
		System.out.println("2. Linkedin");

		try (Scanner scanner = new Scanner(System.in)) {
			String choice = scanner.nextLine();

			ISocialNetwork network;
			if (choice.equals("2")) {
				network = new LinkedIn(createProfiles());
			} else {
				network = new Facebook(createProfiles());
			}

			SocialSpammer spammer = new SocialSpammer(network);
			spammer.sendSpamToFriends("mike@email.com", "Mike from FNM bro");
			spammer.sendSpamToCoworkers("evan@email.com", "We need to work together again!");
		}
	}

	private static List<Profile> createProfiles() {
		List<Profile> listProfiles = new ArrayList<>();

		listProfiles
				.add(new Profile("Mike Patton", "mike@email.com", "friends:max@email.com", "friends:igor@email.com"));
		listProfiles.add(new Profile("Max Cavalera", "max@email.com", "coworkers:igor@email.com"));
		listProfiles.add(new Profile("Igor Cavalera", "igor@email.com", "coworkers:max@email.com",
				"friends:mike@email.com", "friends:alex@email.com"));
		listProfiles.add(new Profile("Alex Newport", "alex@email.com", "friends:max@email.com"));
		listProfiles.add(
				new Profile("Evan Seinfield", "evan@email.com", "coworkers:max@email.com", "coworkers:igor@email.com"));
		listProfiles.add(new Profile("D.H. Peligro", "peligro@email.com", "coworkers:mike@email.com"));

		return listProfiles;
	}
}