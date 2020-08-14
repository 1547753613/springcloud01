package com.aaa.springcloudproduct.impl.service;

import com.aaa.springcloudproduct.entity.Role;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RoleService {


    public Set<Role> SelectRolePid(int[] ints);
}
