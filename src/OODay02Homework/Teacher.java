package OODay02Homework;
//Teacher类：继承Person、salary，Teacher(参)、teach()，重写sayHi()方法
public class Teacher extends Person {
    int salary;
    Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }
    void teach(){
        System.out.println(name+"在教学");
    }
    void sayHi(){
        System.out.println("名字叫"+name+"年龄是"+age+"地址是"+address+"薪水是"+salary);
    }

}
