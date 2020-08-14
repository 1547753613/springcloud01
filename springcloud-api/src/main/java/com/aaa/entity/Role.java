package com.aaa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "role")
@Data
public class Role {
    @Column
    private Integer rid;
    @Column
    private String rname;
    @Column
    private String role;

}
