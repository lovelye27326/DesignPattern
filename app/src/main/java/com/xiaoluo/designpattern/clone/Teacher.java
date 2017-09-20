package com.xiaoluo.designpattern.clone;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式
 *
 * author: xiaoluo
 * date: 2017/9/15 18:10
 */
public class Teacher implements Cloneable {
    private int age;
    private String name;
    private List<String> studens = new ArrayList<>();
    private List<String> classes = new ArrayList<>();

    public Teacher(int age, String name, List<String> studens, List<String> classes) {
        this.age = age;
        this.name = name;
        this.studens = studens;
        this.classes = classes;
    }

    @Override
    public Object clone() {
        try {
            Teacher teacher = (Teacher) super.clone();
            teacher.age = this.age;
            teacher.name = this.name;
            // 浅拷贝
            teacher.studens = this.studens;
            // 深拷贝
            teacher.classes = new ArrayList<>(this.classes);
            return teacher;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStudens() {
        return studens;
    }

    public void setStudens(List<String> studens) {
        this.studens = studens;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "age:" + age + ",name:" + name + ",students:" + studens.toString() + ",class:" + classes;
    }
}
