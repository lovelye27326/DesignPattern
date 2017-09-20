package com.xiaoluo.designpattern.builder;

/**
 * 建造者模式
 *
 * author: xiaoluo
 * date: 2017/9/15 17:04
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private int id;
        private String name;
        private int age;
        private String address;

        // 假设id为必须
        public Builder(int id) {
            this.id = id;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name:" + name + ",id:" + id + ",age:" + age + "address:" + address;
    }
}
