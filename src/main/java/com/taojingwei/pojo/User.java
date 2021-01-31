package com.taojingwei.pojo;

import java.io.Serializable;

/**
 * @author liuwei
 */
public class User implements Serializable {

    private String name;

    private String id;

    public User() {
    }

    public User(String name,String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "',id='" + getId()+"'}";
    }

}