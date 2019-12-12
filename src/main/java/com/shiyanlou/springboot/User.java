package com.shiyanlou.springboot;

import javax.persistence.*;

/**
 * 设置表名为user，并且标记该类为实体类
 */
@Table(name = "user")
@Entity
public class User {

    /**
     * 设置主键生成策略
     */
    //IDENTITY 主键由数据库生成, 采用数据库自增长, Oracle不支持这种方式
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int id;

    //用来标识实体类中属性与数据表中字段的对应关系
    @Column
    private String username;

    @Column
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
