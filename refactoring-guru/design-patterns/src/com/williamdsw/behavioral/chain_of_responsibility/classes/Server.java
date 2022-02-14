package com.williamdsw.behavioral.chain_of_responsibility.classes;

import java.util.HashMap;
import java.util.Map;

public class Server {

	// FIELDS

	private Map<String, String> users = new HashMap<>();
	private Middleware middleware;

	// SETTERS

	public void setMiddleware(Middleware middleware) {
		this.middleware = middleware;
	}

	// FUNCTIONS

	public boolean login(String email, String password) {
		if (middleware.check(email, password)) {
			System.out.println("Autuhorization have been successful!");
			return true;
		}

		return false;
	}

	public void register(String email, String password) {
		users.put(email, password);
	}

	public boolean hasEmail(String email) {
		return users.containsKey(email);
	}

	public boolean isValidPassword(String email, String password) {
		return users.get(email).equals(password);
	}
}