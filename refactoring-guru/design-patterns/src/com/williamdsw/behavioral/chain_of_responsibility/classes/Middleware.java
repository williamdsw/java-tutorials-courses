package com.williamdsw.behavioral.chain_of_responsibility.classes;

public abstract class Middleware {

	// FIELDS

	private Middleware next;

	// FUNCTIONS

	public abstract boolean check(String email, String password);

	public Middleware linkWith(Middleware next) {
		this.next = next;
		return next;
	}

	protected boolean checkNext(String email, String password) {
		if (next == null) {
			return true;
		}

		return next.check(email, password);
	}
}