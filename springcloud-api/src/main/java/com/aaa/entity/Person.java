package com.aaa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Table(name = "person")
@Data
public class Person  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    @Column
    private String pname;
    @Column
    private String pwd;
    @Column
    private Integer isexpired;// 是否过期
    @Column
    private Integer islocked;// 是否上锁
    @Column(name = "isCreExpired")
    private Integer isCreExpired;// 认证是否过期
    @Column
    private Integer isenable;// 是否禁用

    private Set<Role> roles=new HashSet<>();

    private List<Menu> menus=new ArrayList<>();






}
