package com.aaa.springcloudproduct.impl;


import com.aaa.springcloudproduct.dao.PersonRoleDao;
import com.aaa.springcloudproduct.impl.service.PersonRoleService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class PersonRoleImpl implements PersonRoleService {

    @Resource
    PersonRoleDao personRoleDao;

    @Override
    public int[] SelectRolePid(int pid) {

        int[] ints = personRoleDao.SelectRolePid(pid);

        return ints;
    }
}
