package OODay02Demo;

public class Animal {
    String name;
    int age;
    String color;
    Animal(){}
    Animal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的"+name+"在吃东西");
    }
    void drink(){
        System.out.println(color+"色的"+age+"岁的"+name+"在喝水");
    }

}
