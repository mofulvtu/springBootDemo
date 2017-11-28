package com.lzg.springBootDemo.domain;

/**
 * Created by Liuzg on 2017/9/13
 */
public class User {

    private Integer id;

    private String userName;

    /**
     * 描述
     */
    private String description;

    /**
     * 关联的城市
     */
    private City city;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
