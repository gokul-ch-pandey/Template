package com.hikex.webservice.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.hikex.webservice.model.Person;

@Service
public class PersonService {

	Hashtable<String, Person> persons = new Hashtable<String, Person>();

	public PersonService() {
		Person p1 = new Person("1", "gokul", "Pandey", 26);
		Person p2 = new Person("1", "Sanjay", "Pandey", 28);
		persons.put("1", p1);
		persons.put("2", p2);
	}

	public Hashtable<String, Person> getALL() {
		return this.persons;
	}

	public Person get(String id) {
		return this.persons.get(id);
	}
}
