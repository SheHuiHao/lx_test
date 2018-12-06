package com.didi.entity;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private String sex;
    private Date bir;

    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", bir=" + bir +
                '}';
    }

    public User(Integer id, String name, String sex, Date bir) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.bir = bir;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }
}
