package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

public class Ems implements Serializable {
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
    private List<Ems> list;

    public List<Ems> getList() {
        return list;
    }

    public void setList(List<Ems> list) {
        this.list = list;
    }

    public Ems() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Ems(Integer id, String name, Double salary, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ems [id=" + id + ", name=" + name + ", salary=" + salary
                + ", age=" + age + ", list=" + list + "]";
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
