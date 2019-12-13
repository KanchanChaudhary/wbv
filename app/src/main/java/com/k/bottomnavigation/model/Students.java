package com.k.bottomnavigation.model;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private String name, address, gender, age;
    private int imgId;
    private static List<Students> studentsList = new ArrayList<>();

    public Students(String name, String address, String gender, String age, int imgId) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public static List<Students> getStudentsList() {
        return studentsList;
    }

    public static void setStudentsList(List<Students> studentsList) {
        Students.studentsList = studentsList;
    }
}
