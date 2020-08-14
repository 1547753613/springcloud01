package com.aaa.springcloudproduct.dao;

import com.aaa.springcloudproduct.entity.Person;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface PersonDao extends Mapper<Person> {
}
