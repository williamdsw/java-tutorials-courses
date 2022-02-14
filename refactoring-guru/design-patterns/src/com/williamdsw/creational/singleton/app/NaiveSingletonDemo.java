package com.williamdsw.creational.singleton.app;

import java.util.Random;

import com.williamdsw.creational.singleton.naive.SingletonNotSafe;
import com.williamdsw.creational.singleton.naive.SingletonSafe;

public class NaiveSingletonDemo {

	// Single thread not safe: Only same instance -- OK
	public static void naiveSingletonSingleThreadDemo() {
		SingletonNotSafe singleton = SingletonNotSafe.getInstance("First Single");
		SingletonNotSafe anotherSingleton = SingletonNotSafe.getInstance("Second Single");

		System.out.println("Naive Singletons Single Thread");
		System.out.println(singleton.getValue());
		System.out.println(anotherSingleton.getValue());
	}

	// Multi thread not safe: Multiple instances -- WRONG
	public static void nativeSingletonMultithreadDemo() {
		System.out.println("Naive Singletons Multi Thread");

		final int NUMBER_OF_THREADS = 2;
		for (int index = 0; index < NUMBER_OF_THREADS; index++) {
			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					Random random = new Random();
					SingletonNotSafe singleton = SingletonNotSafe
							.getInstance(String.format("%s. Singleton Multithread", random.nextInt()));
					System.out.println(singleton.getValue());
				}
			});

			thread.start();
		}
	}

	// Multi thread safe: Same instance -- OK (volatile, synchronized)
	public static void safeSingletonMultithreadDemo() {
		System.out.println("Safe Singletons Multi Thread");

		final int NUMBER_OF_THREADS = 2;
		for (int index = 0; index < NUMBER_OF_THREADS; index++) {
			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					Random random = new Random();
					SingletonSafe singleton = SingletonSafe
							.getInstance(String.format("%s. Singleton Multithread", random.nextInt()));
					System.out.println(singleton.getValue());
				}
			});

			thread.start();
		}
	}
}
