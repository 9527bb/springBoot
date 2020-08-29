package com.glb.springbootDemo.entity;

import java.io.Serializable;

/**
 * @author GeLinBo
 * @date 2020/6/24 18:57
 */
public class Student implements Serializable {

    private String name;
    private int year;

    public Student() {

    }

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String test2() {
        return "";
    }
    
    public String test1() {
        System.out.println("hh");
        return "";
    }
}
