package com.aph.spring.proj1.springproj1.model;

public class Person {
    private int id;
    private String name;
    private int age;
    private String work;
    private String created_at;

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for work
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    // Getter and Setter for created_at
    public String getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }
}

