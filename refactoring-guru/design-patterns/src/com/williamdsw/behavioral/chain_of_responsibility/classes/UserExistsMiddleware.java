package com.williamdsw.behavioral.chain_of_responsibility.classes;

public class UserExistsMiddleware extends Middleware {

	// FIELDS

	private Server server;

	// CONSTRUCTOR

	public UserExistsMiddleware(Server server) {
		this.server = server;
	}

	// FUNCTIONS

	@Override
	public boolean check(String email, String password) {
		if (!server.hasEmail(email)) {
			System.out.println(String.format("%1s is not registered!\n", email));
			return false;
		}

		if (!server.isValidPassword(email, password)) {
			System.out.println("Wrong password!\n");
			return false;
		}

		return checkNext(email, password);
	}
}