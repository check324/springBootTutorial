package com.infotech.people.management.app.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="person_table")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private int id;
    @Column(name = "first_name", length = 60, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 60, nullable = false)
    private String lastName;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "createion_date")
    private Date creationDate;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
