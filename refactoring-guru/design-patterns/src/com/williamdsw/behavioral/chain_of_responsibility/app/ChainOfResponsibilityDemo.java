package com.williamdsw.behavioral.chain_of_responsibility.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.williamdsw.behavioral.chain_of_responsibility.classes.Middleware;
import com.williamdsw.behavioral.chain_of_responsibility.classes.RoleCheckMiddleware;
import com.williamdsw.behavioral.chain_of_responsibility.classes.Server;
import com.williamdsw.behavioral.chain_of_responsibility.classes.ThrottlingMiddleware;
import com.williamdsw.behavioral.chain_of_responsibility.classes.UserExistsMiddleware;

public class ChainOfResponsibilityDemo {

	// FIELDS

	private static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	private static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	private static Server server;

	// FUNCTIONS

	public static void chainOfResponsibilityDemo() {

		initServer();

		try {
			boolean isLogged = false;
			do {
				System.out.println("Email: ");
				String email = bufferedReader.readLine();
				System.out.println("Password: ");
				String password = bufferedReader.readLine();
				isLogged = server.login(email, password);
			} while (!isLogged);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void initServer() {
		server = new Server();
		server.register("admin@example.com", "londonCalling");
		server.register("some_user@example.com", "iFoughtTheLaw1977");

		Middleware middleware = new ThrottlingMiddleware(2);
		middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());
		server.setMiddleware(middleware);
	}

}
