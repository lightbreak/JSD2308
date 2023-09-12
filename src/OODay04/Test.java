package OODay04;
import OODay03.*;

public class Test {
    public static void main(String[] args) {
        //向下转型/强制类型转换
        //引用所指向的对象
        //
       /*
        Animal a=new Dog("2", 1,"2");//能强转Dog型,Animal型,Swim型,也就是Dog的父类,接口,和本
        Dog d=(Dog)a;//引用a所指的对象,实现了Dog类型
        Swim s=(Swim)a;//引用a所指的对象,实现了Swim接口
        d.swim();
        s.swim();
        //Fish f=(Fish)a;会报错  ClassCastException类型转换异常 也就是转不了
        System.out.println(a instanceof  Fish);//判断是否能进行强制类型转换
        System.out.println(a instanceof  Animal);
        */




        //演示向上造型(多态)的第一点应用;

        Animal[] animal=new Animal[3];
        animal[0]=new Dog("小黑狗",1,"黑色") ;
        animal[1]=new Fish("小红鱼",2,"红");
        animal[2]=new Chick("小花鸡",3,"花");

        for (Animal animal1 : animal) {//遍历所有动物
            System.out.println(animal1.name);
            animal1.eat();//可以直接调用子类的重写方法,无需重写
            animal1.drink();
            // animal1.layEgg();报错,不能调用子类独有的方法;
        }
            //强转
            for (int i=0;i<animal.length;i++){
            if(animal[i] instanceof Dog){//判断引用数组的是否是强转的类型
                Dog dog=(Dog) animal[i];
                dog.swim();
                dog.lookHome();
            }
            if (animal[i] instanceof Fish) {
                Fish fish = (Fish) animal[i];
                fish.swim();
            }
            if (animal[i] instanceof Chick){
                Chick chick=(Chick) animal[i];
                chick.layEggs();
            }
            if (animal[i] instanceof Swim){//适用用于所有适用于Swim接口的对象的实现;
                Swim swim=(Swim) animal[i];
                swim.swim();
            }
        }





//演示向上造型的第二种用法
        /*
        Master master=new Master();
        Dog dog=new Dog("白狗",2,"白");
        Chick chick=new Chick("花鸡",2,"花");
        Fish fish=new Fish("金鱼",2,"金");
        master.feed(dog);//传参的同时,系统做了自动向上造型
        master.feed(chick);
        master.feed(fish);

         */

    }
}
