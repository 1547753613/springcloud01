package com.aaa.springcloudproduct.impl;


import com.aaa.springcloudproduct.dao.PersonDao;
import com.aaa.springcloudproduct.entity.Person;
import com.aaa.springcloudproduct.impl.service.PersonRoleService;
import com.aaa.springcloudproduct.impl.service.PersonService;
import com.aaa.springcloudproduct.impl.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class PersonImpl  implements PersonService {
    private Person person=new Person();
    @Resource
    PersonDao personDao;

    @Autowired
    PersonRoleService personRoleService;

    @Autowired
    RoleService roleService;

    @Override
    public Person PersonFindname(String pname) {
        person.setPname(pname);

        List<Person> list = personDao.select(person);
        if (list.size()!=0){
            Person person = list.get(0);
            /*int[] ints = personRoleService.SelectRolePid(person.getPid());
            person.setRoles(roleService.SelectRolePid(ints));*/
            return person;
        }

        return null;
    }

    @Override
    public List<Person> QueryPersonAll() {

        return personDao.selectAll();
    }

    @Override
    public Integer AddPerson(Person person) {
        int i = personDao.insert(person);
        if (i>0){
            return person.getPid();
        }
        return 0;
    }

    @Override
    public Integer UpdatePerson(Person person) {

        return personDao.updateByPrimaryKey(person);
    }

    @Override
    public Integer DeletePerson(Integer pid) {
        return personDao.deleteByPrimaryKey(pid);
    }
}
