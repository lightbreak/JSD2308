package OODay02;

public class Student extends Person{
    String stuId;
    Student(){}
    //Student stu=new Student("李四",24,"佳木斯","王五","001");//
    Student(String name,int age,String adress,String anname,String stuId){
        super(name,age,adress);//把值传走了，去哪我也不清楚
        this.stuId=stuId;
//        this.age=age;         //被super替代了
//        this.address=adress;
//        this.name=name;
    }
    void study(){
        System.out.println(name+"学");
    }
    //sayHi从父类继承下来，但是没有classname和id，我想加参数，所以要方法的重写
    void say(){//这个蓝色向上箭头表示在重写
        System.out.println(age+"为告死之时 "+address+"从幽谷深渊晦暗之死疾驰而来 "+" 吾为山之翁 "+name
        +"stuId"+stuId);
    }


}
