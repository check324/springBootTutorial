package com.infotech.people.management.app.dao;

import com.infotech.people.management.app.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {

}
