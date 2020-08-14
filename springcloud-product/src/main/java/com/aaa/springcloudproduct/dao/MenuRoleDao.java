package com.aaa.springcloudproduct.dao;

import com.aaa.springcloudproduct.entity.MenuRole;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Set;

@org.apache.ibatis.annotations.Mapper
public interface MenuRoleDao extends Mapper<MenuRole> {

    public Set<Integer> SelectMenuRoleRid(@Param("rid") List<Integer> rid);
}
