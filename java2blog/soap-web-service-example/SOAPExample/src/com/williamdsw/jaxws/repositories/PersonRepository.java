package com.williamdsw.jaxws.repositories;

import com.williamdsw.jaxws.beans.Person;

public interface PersonRepository {

	public boolean addPerson(Person person);

	public boolean deletePerson(int id);

	public Person getPerson(int id);

	public Person[] getAllPersons();

}
