package OODay01;
//构造方法的测试
public class ConsDemo {
    public static void main(String[] args) {
        //无参构造
        Student s=new Student();
        s.sayHi();

        Student zhangsan=new Student("张三",24,"jsd2308","001");
        zhangsan.sayHi();
        //给参数；
        Student lisi= new Student("李四",25,"jsd2308","002");
        lisi.sayHi();//输出
    }
}
