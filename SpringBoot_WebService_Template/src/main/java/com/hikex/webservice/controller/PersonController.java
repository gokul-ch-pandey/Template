package com.hikex.webservice.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikex.webservice.model.Person;
import com.hikex.webservice.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService p;

	@RequestMapping("/all")
	public Hashtable<String, Person> getAll() {
		return p.getALL();
	}

	@RequestMapping("/{id}")
	public Person get(@PathVariable("id") final String id) {
		return p.get(id);
	}
}
