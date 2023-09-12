package OODay02Demo;

public class Dog extends Animal{
    Dog(){}
    public Dog(String name, int age, String color){
        super(name, age, color);
    }

 //重载
    void eat() {
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"在吃东西");
    }
    void lookhome(){
        System.out.println("狗狗"+name+"在看家");
    }
}
