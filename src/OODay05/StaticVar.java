package OODay05;
//静态变量的演示
public class StaticVar {
    int a;//实例变量 属于对象,一个对象就生成一个实例变量 内存位置在方法区(和对象一样
    static  int b;//静态变量 属于类,多个对象也就一个静态变量 内存位置在方法区(和类一样
    StaticVar(){
        a++;
        b++;
    }
    void show(){
        System.out.println(a+","+b);
    }
}
