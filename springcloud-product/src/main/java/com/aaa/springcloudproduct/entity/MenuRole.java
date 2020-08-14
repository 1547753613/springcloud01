package com.aaa.springcloudproduct.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "menu_role")
@Data
public class MenuRole {

    @Id
    private Integer id;
    @Column
    private Integer mid;
    @Column
    private Integer rid;
}
