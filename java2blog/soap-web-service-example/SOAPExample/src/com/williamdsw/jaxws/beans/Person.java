package com.williamdsw.jaxws.beans;

import java.io.Serializable;

public class Person implements Serializable {

	// FIELDS

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private int id;

	// GETTERS - SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// FUNCTIONS

	@Override
	public String toString() {
		String str = "%1s::%2s::%3s";
		str = String.format(str, this.getId(), this.getName(), this.getAge());
		return str;
	}
}
