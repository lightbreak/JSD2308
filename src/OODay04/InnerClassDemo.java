package OODay04;
//成员内部类
public class InnerClassDemo {
    public static void main(String[] args) {

    }
}
//Boo只想aoo用
class Aoo{
    String name;
    Boo b=new Boo();//创建内部类对象,内部类对象通常在外部类创建
    void Creat(){}
    class Boo{//内部类
        void show(){
            System.out.println(name);//简写,默认用Aoo的对象
            System.out.println(Aoo.this.name);//完整写法,Aoo.this指代外部类对象
            //this.name 访问的是Boo的对象
            // Aoo.name是错的
            Aoo.this.Creat();//Aoo.this才是引用外部类的类名
        }

    }

}