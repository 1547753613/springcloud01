package com.aaa.springcloudproduct.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "person_role")
public class PersonRole {

    @Id
    private Integer id;
    @Column
    private Integer pid;
    @Column
    private Integer rid;
}
