package OODay02;

public class Person {
    String name;
    String anname;
    String address;
    int age;
    Person(){}
    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void  eat(){
        System.out.println(anname+"起源之海，贪婪之罪");
    }
    void  sleep(){
        System.out.println(anname+"汝口中的永恒并非行走，而是永眠");
    }
    void  say(){//这个蓝色表示被重写
        System.out.println(age+"为告死之时 "+address+"从幽谷深渊晦暗之死疾驰而来 "+" 吾为山之翁 "+name);
    }

}
