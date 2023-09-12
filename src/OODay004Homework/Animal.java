package OODay004Homework;
//Animal、Swim、Dog、Chick、Fish、Master、Test类：
//Animal类：name、age、color、Animal(参)、drink()、eat()
//Swim接口：swim()
//Dog类：继承Animal、实现Swim接口，重写eat()、lookHome()、重写swim()
//Chick类：继承Animal，重写eat()、layEggs()
//Fish类：继承Animal、实现Swim接口，重写eat()、重写swim()
//Master类：feed()喂动物
//Test：创建Animal数组并填充Dog/Chick/Fish对象，遍历数组：
//输出每个动物的名字，让每个动物吃饭、喝水
//若为Dog，则让它看家。若为Chick，则让它下蛋。若能游泳，则让它游泳。
//创建Master对象、Dog对象、Fish对象、Chick对象，并喂养动物
public abstract class Animal {
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
        System.out.println(name+"在喝水");
    }
    abstract void eat();
}
interface Swim{
    void swim();
}
class Dog extends Animal implements Swim{
    @Override
    void eat() {
        System.out.println(name+age+color+"在吃小鸡");
    }

    @Override
    public void swim() {
        System.out.println(name+"在游泳");
    }
    void lookhome(){
        System.out.println(name+"在看家");
    }
}
class Chink extends Animal{
    @Override
    void eat() {
        System.out.println(name+age+color+"在吃小鱼");
    }
    void layEgg(){
        System.out.println(name+"在下单");
    };
}
class Fish extends Animal implements Swim{
    @Override
    void eat() {
        System.out.println(name+"在吃鸡蛋");
    }

    @Override
    public void swim() {
        System.out.println(name+"在游泳啊"
        );
    }
}
class Master {
    void feed(){

    }
}