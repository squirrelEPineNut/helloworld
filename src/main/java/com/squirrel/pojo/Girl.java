package com.squirrel.pojo;

import java.util.Date;

public class Girl {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private  String lastName;
    private  String flower;
    private Date  birthday;


}
