package Day03;// Oper运算符 ++ -- %

public class OperDemo {
    public static void main(String[] args) {

        int e,a=1,b=1,c=1,d=1;;
        //b=a++   ==> a=a+1=2;b=a=1;
        //b=++a   ==> a=a+1=2;b=a+1=2;

        b=a++;
        System.out.println(a);//2
        System.out.println(b);//1 先计算的c=a;再a++;
        c=++d;
        System.out.println(c);//2
        System.out.println(d);//2


        int k,i=4,j=3;
        // i=5   j=2   i=6  j=1    i=7,i++=6
        k=(i++)+(j--)+(++i)-(j--)+(i++);
        //   4 +  3  +  6  - 2   + 6 =17
        System.out.println(k);
        //总结 a++在计算中的值等于a本身的值，同时给a本身+1，在后续计算中a=a+1;



        //关系运算符
        // <= >= == !=
        a=5;b=5;
        System.out.println(a++>5);// false;
        System.out.println(a++>5);//true;
        System.out.println(b--<5);//false



        //逻辑运算符
        // & ; | ; ! ; ^ 与 或 非 异或
        //&& ; || ; 短路与 ， 短路或

        a=5;b=5;
        System.out.println(a++>5&&(++b)>5);//&&先执行左，为false则跳过右侧运算
        System.out.println(a);



        System.out.println(b);
        a=5;b=5;
        System.out.println((++b)>5&&(a++>5));
        System.out.println(a);
        System.out.println(b);




        int score=99;
        System.out.println("成绩不合法？"+(score<0 | score>100));// 成绩不在0-100内为true
        System.out.println("成绩合法？"+(score>0 & score<100));// 成绩在0-100内为true

        //赋值运算符
        //=,-=,+=,*=.%=,/=带一个强转;
        short s=1;
       //s= s+10;   报错,需要强转，
        s+=10;//不报错,已经强转
        s*=2;//等于 s=(int)s*2;


        //+ 连接符
        System.out.println("无人可知之地"+s+"无");
        String  feeling="多是唏嘘";
        System.out.println(feeling+"是生来皆有宿命");
        System.out.println(""+10+20);//1020 String类型
        System.out.println(10+20+"");//30   只要有”“参与,整个都为字符串类型
        System.out.println(10+""+20);//1020  String

        //条件运算符 boolean?1:2;
        boolean flag;
        int num1=1;int num2=2;
        flag=num1>num2?true:false;
        System.out.println("flag="+flag);





    }
    public static  void 条件运算符(String[] args)
    {
        //条件运算符
        boolean flag;
        int num1=1;int num2=2;
        flag=num1>num2?true:false;
        System.out.println("flag="+flag);

    }

}
