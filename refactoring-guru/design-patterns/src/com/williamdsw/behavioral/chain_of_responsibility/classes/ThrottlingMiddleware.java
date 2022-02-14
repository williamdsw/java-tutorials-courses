package com.williamdsw.behavioral.chain_of_responsibility.classes;

public class ThrottlingMiddleware extends Middleware {

	// FIELDS

	private int requestsPerMinute;
	private int request;
	private long currentTime;

	// CONSTRUCTOR

	public ThrottlingMiddleware(int requestsPerMinute) {
		this.requestsPerMinute = requestsPerMinute;
		this.currentTime = System.currentTimeMillis();
	}

	// FUNCTIONS

	@Override
	public boolean check(String email, String password) {
		if (System.currentTimeMillis() > (currentTime + 60_000)) {
			request = 0;
			currentTime = System.currentTimeMillis();
		}

		request++;

		if (request > requestsPerMinute) {
			System.out.println("Request limit exceeded");
			Thread.currentThread().interrupt();
		}

		return checkNext(email, password);
	}
}