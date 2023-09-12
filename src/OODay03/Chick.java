package OODay03;

/** 小鸡 */
public class Chick extends OODay03.Animal {
    Chick(){
    }
    public Chick(String name, int age, String color){
        super(name,age,color);
    }

    public void layEggs(){
        System.out.println(color+"色的"+age+"岁的小鸡"+name+"正在下蛋...");
    }
    public void eat(){
        System.out.println(color+"色的"+age+"岁的小鸡"+name+"正在吃小米...");
    }
}


















