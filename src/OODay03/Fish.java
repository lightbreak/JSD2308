package OODay03;
/** 小鱼 */
public class Fish extends OODay03.Animal implements Swim {
    Fish(){
    }
    public Fish(String name, int age, String color){
        super(name,age,color);
    }

    public void eat(){
        System.out.println(color+"色的"+age+"岁的小鱼"+name+"正在吃小虾...");
    }
    public void swim(){
        System.out.println(color+"色的"+age+"岁的小鱼"+name+"正在游泳...");
    }
}



















