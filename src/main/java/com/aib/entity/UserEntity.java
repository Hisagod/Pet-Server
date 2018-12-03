package com.aib.entity;

import org.springframework.stereotype.Repository;

@Repository(value = "userEntity")
public class UserEntity {
    private int id;
    private String phone;
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
