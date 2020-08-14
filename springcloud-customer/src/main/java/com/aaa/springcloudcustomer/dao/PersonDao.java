package com.aaa.springcloudcustomer.dao;

import com.aaa.entity.Person;
import com.aaa.springcloudcustomer.impl.PersonImpl;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "springcloud-producta",fallback = PersonImpl.class)
public interface PersonDao {

        @RequestMapping("/person/PersonAll")
        public Person QueryPerson(@RequestParam("name")String name);

        @GetMapping("/person/QueryPersonAll")
        public List<Person> SelectPersonAll();

        @PostMapping("/person/AddPerson")
        public Integer AddPerson(@RequestBody Person person);

        @PutMapping("/person/UpdatePerson")
        public Integer UpdatePerson(@RequestBody Person person);

        @DeleteMapping("/person/DeletePerson/{id}")
        public Integer DeletePerson(@PathVariable("id") Integer id);
}
