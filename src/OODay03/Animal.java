package OODay03;
/** 动物 */
public abstract class Animal {
    public String name;
    int age;
    String color;
    Animal(){
    }
    Animal(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void drink(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在喝水...");
    }
    public abstract void eat();
}
















