package OODay03;
/** 狗 */
public class Dog extends OODay03.Animal implements Swim {
    Dog(){
    }
    public Dog(String name, int age, String color){
        super(name,age,color);
    }

    public void lookHome(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在看家...");
    }
    public void eat(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在吃骨头...");
    }
    public void swim(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在游泳...");
    }
}



















