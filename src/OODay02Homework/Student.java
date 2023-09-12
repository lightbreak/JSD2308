package OODay02Homework;
//Student类：继承Person、className、stuId，Student(参)、study()，重写sayHi()方法
public class Student extends Person{
    String stuId;
    Student(String name,int age,String address,String stuId){
        super(name,age,address);
        this.stuId=stuId;
    }
    void sayHi(){
        System.out.println("名字叫"+name+"年龄是"+age+"地址是"+address+"学号是"+stuId);
    }
    void study(){
        System.out.println(name+"在学习");
    }
}
