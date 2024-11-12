package cn.xiaohai.springbootdemo.controller;

import org.apache.tomcat.jni.Address;

public class User {

    private int id;
    private String name;
    private int age;


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

    // 重写 toString() 方法
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*为什么重写toString()方法？

     因为我们在开发中，经常需要将对象转换为字符串，以便于输出或者存储。
     例如，我们可以将对象转换为JSON格式的字符串，然后将其存储到数据库中。
     或者，我们可以将对象转换为XML格式的字符串，然后将其存储到文件中。
     */
    //




}
