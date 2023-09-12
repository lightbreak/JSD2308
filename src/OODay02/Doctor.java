package OODay02;

public class Doctor extends Person{
    String tilte;
    Doctor(){};
    Doctor(String tilte,String name,String adress,int age){

        super.name=name;//super 访问父类的值
        this.tilte=tilte;
        super.address=adress;
        this.age=age;
    }
    void  say(String name,int age,String address,String tilte){//这个蓝色表示重写
        System.out.println(age+"为年龄 "+address+"为地址 "+" 名字是 "+name+"职称是"+tilte);
    }

}


