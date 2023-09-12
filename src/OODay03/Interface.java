package OODay03;
//接口的演示
public class Interface {
    Interface(){};
    void methed(){};

    public static void main(String[] args) {
        //inter i=new inter();//接口也不能被实例化，也不能创建对象，
    }
}
interface  inter{//接口也是数据类型，和class一样
    void methed();//接口中的方法自带abstract
    abstract void function();

}
interface  inter1{
    void  show();
}
interface inter2{
    void  show2();
}
//接口的实现
//类实现接口
class InterImpl implements inter{ //实现类
    //必须把接口所有的抽象方法都重写
    @Override
    public void methed() {//重写接口的抽象方法时必须加public
    }
    @Override
    public void function() {
    }
}
//接口的多实现

class Boo extends Interface implements inter1,inter2{
    @Override
    public void show() {
    }

    @Override
    public void show2() {

    }

    @Override
    void methed() {
        super.methed();
    }
}
//演示接口继承接口
interface inter3 extends inter2{
    void show3();
}
class Aoo implements inter3{
    @Override//inter2的抽象方法
    public void show2() {

    }
    @Override//inter3的抽象方法
    public void show3() {

    }
}