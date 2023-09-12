package OODay02Homework;
//Doctor类：继承Person、title，Doctor(参)、cut()
public class Doctor extends Person{
    String tatel;
    Doctor(String name,int age,String address,String tatel){
        super(name,age,address);
        this.tatel=tatel;
    }
    void sayHi(){
        System.out.println("名字叫"+name+"年龄是"+age+"地址是"+address+"职位是"+tatel);
    }
    void heailing(){
        System.out.println(name+"正在做手术");
    }
}
