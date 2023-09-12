package OODay03Homework;
//Animal、Swim、Dog、Chick、Fish：---------------------------2遍
//Animal类：name、age、color、Animal(参)、drink()、abstract eat()
//
//Swim接口：swim()
//
//Dog类：继承Animal、实现Swim接口，重写eat()、lookHome()、重写swim()
//
//Chick类：继承Animal，重写eat()、layEggs()
//
//Fish类：继承Animal、实现Swim接口，重写eat()、重写swim()
//
//RefArrayDemo类：---------------------2遍
//
//设计Dog数组dogs，Chick数组chicks，Fish数组fish，各自填充数据，遍历数组，访问元素的属性及调用方法
//

public  abstract class Animal {
    String name;
    int age;
    String color;
    Animal(){}
    Animal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void drink(){
        System.out.println("名字是"+name);
    }
    abstract  void  eat();
}
interface Swim{
    void swim();
}
class Dog extends Animal implements Swim{
    Dog(){}
    Dog(String name,int age,String color){super(name, age, color);}
    @Override
    void eat() {
        System.out.println("小狗"+name+"在吃鸡");
    }
    @Override
    public void swim() {
        System.out.println("小狗"+name+"游泳");
    }
    void lookhome(){
        System.out.println("小狗"+name+"在看家");
    }
}
class Chink extends Animal {
    Chink(){}
    Chink(String name,int age,String color){
        super(name, age, color);
    }
    @Override
    void eat() {
        System.out.println("小鸡"+name+"在吃鱼");
    }
    void layEgg(){
        System.out.println("小鸡"+name+"在下蛋");
    }
}
class Fish extends Animal implements Swim{
    Fish(){}
    Fish(String name,int age,String color){super(name, age, color);
    }
    @Override
    void eat() {
        System.out.println("小鱼"+name+"在吃蛋");
    }

    @Override
    public void swim() {
        System.out.println("小鱼"+name+"在游泳");
    }
}