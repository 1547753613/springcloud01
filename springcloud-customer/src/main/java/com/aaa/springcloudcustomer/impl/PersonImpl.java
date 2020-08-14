package com.aaa.springcloudcustomer.impl;

import com.aaa.entity.Person;
import com.aaa.springcloudcustomer.dao.PersonDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonImpl implements PersonDao {


    @Override
    public Person QueryPerson(String name) {
        return null;
    }

    @Override
    public List<Person> SelectPersonAll() {
        return null;
    }

    @Override
    public Integer AddPerson(Person person) {
        return null;
    }

    @Override
    public Integer UpdatePerson(Person person) {
        return null;
    }

    @Override
    public Integer DeletePerson(Integer id) {
        return null;
    }
}
