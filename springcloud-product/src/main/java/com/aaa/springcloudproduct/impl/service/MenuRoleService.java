package com.aaa.springcloudproduct.impl.service;

import com.aaa.springcloudproduct.entity.MenuRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface MenuRoleService {
    /**
     *
     * @param rid 传角色id集合查询权限id
     * @return  权限id list
     */
    public Set<Integer> SelectMenuRoleRid(@Param("rid") List<Integer> rid);


    /**
     * 添加角色权限
     * @param menuRole
     * @return
     */
    public Integer AddMenuRole(MenuRole menuRole);

}
