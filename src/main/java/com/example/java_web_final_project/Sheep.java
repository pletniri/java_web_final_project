package com.example.java_web_final_project;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Sheep {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String color;

    public Sheep(Integer id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Sheep(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Sheep() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
