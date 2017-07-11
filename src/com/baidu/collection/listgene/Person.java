package com.baidu.collection.listgene;

import java.util.Random;
import java.util.UUID;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Person implements Generator<Person>{
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Person:{");
        sb.append("name:").append(name).append(";");
        sb.append("sex:").append(sex).append(";");
        sb.append("age:").append(age).append("}");
        return sb.toString();
    }

    public Person() {
    }

    @Override
    public Person next() {
        return new Person(UUID.randomUUID().toString().substring(0,10).replace("-",""),new Random().nextInt(10) > 5 ? "man" : "woman",new Random().nextInt(40));
    }
}
