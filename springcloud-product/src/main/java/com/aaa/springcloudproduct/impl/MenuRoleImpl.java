package com.aaa.springcloudproduct.impl;

import com.aaa.springcloudproduct.dao.MenuRoleDao;
import com.aaa.springcloudproduct.entity.MenuRole;
import com.aaa.springcloudproduct.impl.service.MenuRoleService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Repository
public class MenuRoleImpl implements MenuRoleService {

    @Resource
    MenuRoleDao menuRoleDao;

    /**
     *
     * @param rid 传角色id集合查询权限id
     * @return
     */
    @Override
    public Set<Integer> SelectMenuRoleRid(List<Integer> rid) {
        return menuRoleDao.SelectMenuRoleRid(rid);
    }

    /**
     *
     * @param menuRole
     * @return
     */
    @Override
    public Integer AddMenuRole(MenuRole menuRole) {
        int insert = menuRoleDao.insert(menuRole);
        return insert;
    }
}
