package com.aaa.springcloudproduct.impl.service;

import com.aaa.springcloudproduct.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonService {

    public Person PersonFindname(String pname);

    public List<Person> QueryPersonAll();

    public Integer AddPerson(Person person);

    public Integer UpdatePerson(Person person);

    public Integer DeletePerson(Integer pid);
}
