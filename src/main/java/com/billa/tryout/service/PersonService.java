package com.billa.tryout.service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import com.billa.tryout.model.Person;

@Service
public class PersonService {
	
	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	
	public PersonService() {

		Person p = new Person();
		p.setId("1");
		p.setFirstName("Bash");
		p.setLastName("Bin");
		p.setAge(10);		
		persons.put("1", p);
		
		p = new Person();
		p.setId("2");
		p.setFirstName("Big");
		p.setLastName("Ben");
		p.setAge(35);		
		persons.put("2", p);
	}
	
	//Get people
	public Person getPerson(String id) {
		if(persons.containsKey(id))
			return persons.get(id);
		else
			return null;
	}
	
	public Hashtable<String, Person> getAll(){
		return persons;
	}
	
}
