package com.williamdsw.jaxws.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.williamdsw.jaxws.beans.Person;
import com.williamdsw.jaxws.repositories.PersonRepository;

public class PersonService implements PersonRepository {

	// FIELDS

	private static Map<Integer, Person> mapPersons = new HashMap<>();

	// FUNCTIONS

	@Override
	public boolean addPerson(Person person) {
		if (mapPersons.get(person.getId()) != null) {
			return false;
		}

		mapPersons.put(person.getId(), person);
		return true;
	}

	@Override
	public boolean deletePerson(int id) {
		if (mapPersons.get(id) == null) {
			return false;
		}

		mapPersons.remove(id);
		return true;
	}

	@Override
	public Person getPerson(int id) {
		return mapPersons.get(id);
	}

	@Override
	public Person[] getAllPersons() {
		Set<Integer> ids = mapPersons.keySet();
		Person[] arrayPersons = new Person[ids.size()];

		int index = 0;
		for (Integer id : ids) {
			arrayPersons[index] = mapPersons.get(id);
			index++;
		}

		return arrayPersons;
	}

}
