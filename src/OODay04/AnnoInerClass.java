package OODay04;

public class AnnoInerClass {
    public static void main(String[] args) {
        //1)创建了一个无名的派生类
        //2)并为派生类创建一个对象,且只能有一个,名为i,向上造型为Inter类型;
        //new Inter(){} 是在创建Inter的派生类的对象
        Inter i=new Inter(){@Override public void eat() {}};
        i.eat();
        //1)又创建了一个无名的派生类
        //2)并为派生类创建一个对象,且只能有一个,名为i1,向上造型为Inter类型;
        //new Inter(){} 是在创建Inter的派生类的对象,且此时i和i1不是一个类的对象
        Inter i1=new Inter(){@Override public void eat() {}};
        i1.eat();
        //等价于
        class Aoo implements Inter{ @Override public void eat() {}}
        Aoo a=new Aoo();
        a.eat();
    }
}


interface Inter{
    void eat();
}//接口