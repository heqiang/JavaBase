package com.ReflectionAnnotation.Reflection;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c1 = Class.forName("com.ReflectionAnnotation.Reflection.User");
        System.out.println(c1);
        //一个类在内存中只有一个class对象
        //一个类被加载后，类的结构都会被封装到class对象中
        Class c = c1.getClass();
        System.out.println(c);
    }
}


class User {
    private String name;
    private int age;
    private int id;

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public User() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}


class Student extends User {
    public Student() {
        System.out.println("我是学生");
    }
}

class Teacher extends User {
    public Teacher() {
        System.out.println("我是老师");
    }
}
