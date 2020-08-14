package com.aaa.springcloudproduct.impl;

import com.aaa.springcloudproduct.dao.RoleDao;
import com.aaa.springcloudproduct.entity.Role;
import com.aaa.springcloudproduct.impl.service.RoleService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class RoleImpl implements RoleService {

    @Resource
    RoleDao roleDao;

    @Override
    public Set<Role> SelectRolePid(int[] ints) {

        Example example=new Example(Role.class);
        Example.Criteria criteria=example.createCriteria();
        if (ints.length==0||ints==null) {
            return null;

        }
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());

        criteria.andIn("rid", list);
        List<Role> roles = roleDao.selectByExample(example);
        Set<Role> sets = new HashSet<>();
        sets.addAll(roles);
        return sets;
    }

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().matches("123456","$2a$10$Jk8ahBk084ZT8wpZsHs1J.lRYJ3v26ZG86ECyIMHKCZt8LlqxnGA.")
);
    }
}
