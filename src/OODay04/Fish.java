package OODay04;

import OODay03.Swim;

/** 小鱼 */
public class Fish extends Animal implements Swim {
    Fish(){
    }
    Fish(String name,int age,String color){
        super(name,age,color);
    }

    void eat(){
        System.out.println(color+"色的"+age+"岁的小鱼"+name+"正在吃小虾...");
    }
    public void swim(){
        System.out.println(color+"色的"+age+"岁的小鱼"+name+"正在游泳...");
    }
}



















