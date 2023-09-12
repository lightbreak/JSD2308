package OODay02Homework;

import javax.swing.*;
//Person类：name、age、address、Person(参)、eat()、sleep()，sayHi()
public class Person {
    String name;
    int age;
    String address;
    Person(){}
    Person(String name,int age,String address){
        this.name=name;
        this.address=address;
        this.age=age;
    }
    void eat(){
        System.out.println(name+"是名字");
    }
    void sleep(){
        System.out.println(name+"在"+address+"睡觉");
    }
    void sayHi(){
        System.out.println("名字叫"+name+"年龄是"+age+"地址是"+address);
    }
}
