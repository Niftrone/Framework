package com.service.mysawon.model;

public class MySawon {
    private String id;
    private String pwd;
    private String name;
    private int age;

    public MySawon() {
    }

    public MySawon(String id, String pwd, String name, int age) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MySawon{" +
               "id='" + id + ''' +
               ", pwd='" + pwd + ''' +
               ", name='" + name + ''' +
               ", age=" + age +
               '}';
    }
}
