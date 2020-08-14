package com.aaa.springcloudproduct.impl.service;

import com.aaa.springcloudproduct.entity.Menu;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface MenuService {

    public List<Menu> SelectMenuRole(Set<Integer> sets);
}
