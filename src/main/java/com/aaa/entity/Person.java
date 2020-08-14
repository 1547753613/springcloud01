package com.aaa.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.thymeleaf.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;

@Table(name = "person")
@Data
public class Person implements UserDetails {

    @Id
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

    public String getauthorityString(){
        List<String>list=new ArrayList<>();
        for (Role role:roles){
            String rname = role.getRname();
            list.add(rname);
        }
        return StringUtils.join(list,",");
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return AuthorityUtils.commaSeparatedStringToAuthorityList(this.getauthorityString());

    }

    @Override
    public String getPassword() {
        return this.pwd.trim();
    }

    @Override
    public String getUsername() {
        return this.pname;
    }

    //是否过期
    @Override
    public boolean isAccountNonExpired() {
        return this.isexpired==1;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.islocked==1;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.isCreExpired==1;
    }

    @Override
    public boolean isEnabled() {
        return this.isenable==1;
    }

    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("admin");
        list.add("user");

        System.out.println(list.contains("admin"));
    }
}
