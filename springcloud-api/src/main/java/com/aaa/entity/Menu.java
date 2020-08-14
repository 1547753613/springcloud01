package com.aaa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "menu")
public class Menu {

    @Id
    private Integer id;
    @Column
    private String url;

    @Column
    private String path;

    @Column
    private  String name;

    @Column(name = "parentId")
    private  Integer parentld;
}
