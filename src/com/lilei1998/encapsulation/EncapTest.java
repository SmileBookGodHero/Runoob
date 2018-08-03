package com.lilei1998.encapsulation;

/**
 * Created by lilei on 2017/7/3.
 */
public class EncapTest {

    private String name;
    private String idNum;
    private int age;

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(String newId) {
        idNum = newId;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}

// public 方法是外部类访问该类成员变量的入口
// 通常情况下，这些方法被称为getter和setter方法


