package OODay01Homework;
//Student类和StudentTest类：
//- Student类：name，age，className，stuId，构造方法()，study()，sayHi()，playWith(String anotherName)
//- StudentTest类：创建对象，访问测试
public class student {
    String name;
    int age;
    String className;
    String stuId;
    student(){}
    student(String name,int age,String className,String stuId){
        this.name=name;
        this.age=age;
        this.className=className;
        this.stuId=stuId;
    }
    void sayHi(){
        System.out.println("我的名字叫"+name+"\t"+"年龄是"+age+"\t"+"班级名是"+className+"\t"+"学号是"+stuId);
    }
    void playWith(String anotherName){
        System.out.println("在玩"+anotherName);
    }
}
