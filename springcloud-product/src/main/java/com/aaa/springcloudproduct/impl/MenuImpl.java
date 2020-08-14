package com.aaa.springcloudproduct.impl;


import com.aaa.springcloudproduct.dao.MenuDao;
import com.aaa.springcloudproduct.entity.Menu;
import com.aaa.springcloudproduct.impl.service.MenuService;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Repository
public class MenuImpl implements MenuService {

    @Resource
    MenuDao menuDao;

    /**
     * 传set集合查询所有权限
     * @param sets  因为有的觉得权限一样所以传set集合
     * @return List 权限对象
     */
    @Override
    public List<Menu> SelectMenuRole(Set<Integer> sets) {
        Example example=new Example(Menu.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andIn("id",sets);
        List<Menu> menus = menuDao.selectByExample(example);


        return menus;
    }
}
