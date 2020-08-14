package com.aaa.springcloudproduct.controller;

import com.aaa.springcloudproduct.entity.Person;
import com.aaa.springcloudproduct.impl.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "/person",produces = { "application/json;charset=UTF-8" })
public class UserController {

    @Autowired
    PersonService personService;


    @RequestMapping("/getUser")
    public String getUser(){
        return "陈天昊";
    }


    /**
     * 按name查询员工信息
     * @param name
     * @return
     */
    @RequestMapping("/PersonAll")
    public Person QeuryPersonAll(String name){
        Person person = personService.PersonFindname(name);
        return person;
    }

    /**
     * 查询所有员工
     * @return
     */
    @GetMapping("/QueryPersonAll")
    public List<Person> SelectPersonAll(){
    return personService.QueryPersonAll();
    }

    /**
     * 添加员工
     * @param person
     * @return
     */
    @PostMapping("/AddPerson")
    public Integer AddPerson( @RequestBody Person person){


        return personService.AddPerson(person);}

    @PutMapping("/UpdatePerson")
    public Integer UpdatePerson(@RequestBody Person person){
        System.out.println("person:"+person
        );
        return personService.UpdatePerson(person);
    }

    @DeleteMapping("/DeletePerson/{id}")
    public Integer DeletePerson(@PathVariable("id") Integer id){
        return personService.DeletePerson(id);
    }

}
