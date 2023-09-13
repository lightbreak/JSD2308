package OODay05;

public class StaticDemo {
    static{
        String classId ="JSD2308";
    }
    public static void main(String[] args) {
        StaticVar s = new StaticVar();
        s.show();//a=1,b=1;
        StaticVar s1 = new StaticVar();
        s1.show();//a=1,b=2;
        StaticVar s2 = new StaticVar();
        s2.show();//a=1,b=3;
        System.out.println(StaticVar.b);//常常通过类名点来访问 :class.b

        //////////////////////////////////////////////////////
        StatiBlock sb = new StatiBlock();//加载类时自动执行静态块,但静态块只执行一次
        StatiBlock sb2 = new StatiBlock();//构造方法每次加载都会执行
        StatiBlock sb3 = new StatiBlock();


        //////////////////
        StaticMethod sm = new StaticMethod();
        System.out.println(sm.a);
        sm.a=StaticMethod.b+1;
        StaticMethod.b=1;
        System.out.println(StaticMethod.b);
        System.out.println(sm.a);



        //加载Loo.class到方法区中
        //静态变量num一并寄存到方法区
        //到方法区中获取num的值并输出
        System.out.println(Loo.num);
        //编译器在编译时会直接常量替换为具体的数,效率高
        System.out.println(Loo.PI);


    }

    static class Loo{
        public static int num=1;
        public static final  double PI=3.14159;
        //public static final int NUM;报错,常量必须声明的同时初始化;
        public static final String P="打ππ";}
}

