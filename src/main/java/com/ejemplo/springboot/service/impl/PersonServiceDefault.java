package com.ejemplo.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.springboot.bean.Person;
import com.ejemplo.springboot.repository.PersonRepository;
import com.ejemplo.springboot.service.PersonService;

@Service
public class PersonServiceDefault implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Person getById(int id) {
		return personRepository.findOne(id);
	}

	@Override
	public Person create(Person person) {
		return personRepository.save(person);
	}

}
