package com.ejemplo.springboot.service;

import com.ejemplo.springboot.bean.Person;

public interface PersonService {

	public Person getById(int id);
	
	public Person create(Person person);
	
}
