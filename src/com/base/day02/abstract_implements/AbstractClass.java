package com.base.day02.abstract_implements;

public abstract  class AbstractClass {
        public String name;
        public int age;

        public  AbstractClass(String name,int age){
                this.name = name;
                this.age = age;
        }

        public AbstractClass(){}

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
}
