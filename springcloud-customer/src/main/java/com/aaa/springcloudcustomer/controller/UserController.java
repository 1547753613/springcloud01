package com.aaa.springcloudcustomer.controller;

import com.aaa.entity.Person;
import com.aaa.springcloudcustomer.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/",produces = { "application/json;charset=UTF-8" })
public class UserController {


    @Resource
    PersonDao personDao;


    @GetMapping(value = "query")
    public String query1(){
        return "Get方法";
    }

    @GetMapping(value = "queryPname")
    public Person query(String name){
        return personDao.QueryPerson(name);
    }

    @GetMapping(value = "SelectPersonAll")
    public List<Person> SelectPersonAll(){
        return personDao.SelectPersonAll();
    }

    @PostMapping(value = "AddPerson")
    public Integer AddPerson(@RequestBody Person person)
    {
        System.out.println(person);
        return personDao.AddPerson(person);}

    @PutMapping(value = "UpdatePerson")
    public Integer UpdatePerson(@RequestBody Person person){
        System.out.println(person);
        return personDao.UpdatePerson(person);
    }

    @DeleteMapping("DeletePerson/{id}")
    public Integer DeletePerson(@PathVariable("id") Integer id){

        System.out.println(id);

        return personDao.DeletePerson(id);
    }

}
