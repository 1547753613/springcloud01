package com.aaa.springcloudproduct.dao;

import com.aaa.springcloudproduct.entity.PersonRole;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface PersonRoleDao extends Mapper<PersonRole> {
    public int[] SelectRolePid(int pid);

}
