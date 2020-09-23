package com.ejemplo.springboot.repository;

import com.ejemplo.springboot.bean.Person;

public interface PersonRepository {

	Person findOne(int id);
	
	Person save(Person person);
	
	
}
