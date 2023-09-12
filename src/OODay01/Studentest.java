package OODay01;

public class Studentest {
    public static void main(String[] args) {
        //创建一个学生对象
        Student caixukun = new Student();//Student 张三=new Student 会自动创建一个构造无参方法
        //访问成员变量
        caixukun.name = "张三";
        caixukun.age = 24;
        caixukun.className = "jsd2308";
        caixukun.stuId = "001";
        //调用方法
        caixukun.study();
        caixukun.sayHi();
        caixukun.playWith("李四");

        Student ls = new Student();
        ls.name = "李四";
        ls.age = 25;
        ls.className = "jsd2308";
        ls.stuId = "002";
        ls.study();
        ls.sayHi();
        ls.playWith("张三");
        //1)创建了一个学生对象
        //2)给所有成员变量赋默认值
        Student ww = new Student();
        ww.study();
        ww.sayHi();
        ww.playWith("张三");

    }
}
