package OODay01;
//学生类
public class Student {
    //成员变量---描述对象的属性，对整个类生效
    String name;
    int age;
    String className;
    String stuId;
    //构造方法
    Student(){};//构造方法的重载 无参构造-黄色意为被调用，灰色为未被调用；
    Student(String name,int age,String className,String stuId){
        this.name=name;//this 当成员变量和变量名相同时区别，不同名时，不影响
        this.age=age;
        this.className=className;
        this.stuId=stuId;
    }

    //方法---描述对象的行为
    void study(){
        System.out.println(name+"在学习...");
    }
    void sayHi(){
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，所在班级为:"
                +className+"，学号为:"+stuId);
    }
    void playWith(String anotherName){
        System.out.println(name+"正在和"+anotherName+"一起玩...");
    }
}
