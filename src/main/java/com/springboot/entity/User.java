package com.springboot.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-01-04 15:10:39
 */

public class User implements Serializable {
    private static final long serialVersionUID = 977487702622721721L;
    @Excel(name = "id")
    private Integer id;
    @Excel(name = "id")
    private String userName;
    @Excel(name = "id")
    private String passWord;
    @Excel(name = "id")
    private String qq;
    @Excel(name = "id")
    private String sex;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}