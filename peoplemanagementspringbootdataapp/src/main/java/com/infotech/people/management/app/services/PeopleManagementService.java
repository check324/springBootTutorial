package com.infotech.people.management.app.services;

import com.infotech.people.management.app.dao.PeopleManagementDao;
import com.infotech.people.management.app.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleManagementService {

    @Autowired
    private PeopleManagementDao peopleManagementDao;
    public Person createPerson(Person person1) {
        return peopleManagementDao.save(person1);
    }
}
