package Day03;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //1. 运算符的练习：算术、关系、逻辑、赋值、字符串连接、条件
        //2. 分支结构的练习：if结构
        //3. 分支结构的练习：if...else结构
        //4. 分支结构的练习：if...else if结构
        int a=1;int b=2;int c=3;
        a=a+b;//3
        b=b-a;//1
        a=a*b;//2
        b=b%a;//0
        a=a/b;//0

        a*=b;//a=a*b 2

        boolean B1=a>b;//false
        System.out.println(B1);//false
        System.out.println(a<=b);//true
        System.out.println(a++>b);//true

        //&&
        System.out.println(a>b&&b<c);//false
        System.out.println(b<a&&b<c);//false
        System.out.println(b>a&&b<c);//true
        // ||
        System.out.println(a<b||a>b);//false
        System.out.println(a<b||b>a);//true
        //!
        System.out.println(!B1);//true
        // 短路
        boolean B2=true;
        B2=(a>b&&(a++<b));
        System.out.println(B2);//flase
        System.out.println(a);//a=1

        a*=b;//a=a*b=2
        b-=a;//b=b-a=-3
        System.out.println("a*=b="+a);//a*=b=2
        System.out.println("b-=a"+b);//b-=a-3

        boolean B3=a>b?true:false;

        int a1=11;int a2=22;
        int Max=a1>a2?a1:a2;
        System.out.println(Max); //22

        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num>=500){
            num*=0.8;
        }
        System.out.println(num);

        int score=num;
        if(0<=score&&score<=100){
            System.out.println("合法");
        }else {
            System.out.println("不合法");
        }


        if(num>=2000){
            num*=0.5;
        }else if(1000<=num){
            num*=0.7;
        }else if(num>=500){
            num*=0.8;
        }else{
            num*=0.9;
        }
        System.out.println("折后价格为"+num);





//拓展
        //1.声明两个整型变量a和b并分别赋值，找到a和b中的最大值，并输出。用两种方式实现：条件运算符、if..else分支结构。
        int A=15;int B=18;
        if(A>b){
            B=A;
            System.out.println(B);
        }else{
            A=B;
            System.out.println(A);
        }

        Max=A>B?A:B;
        System.out.println(Max);

        //2. 声明一个整型变量year并存储年份，判断其是平年还是闰年，若是闰年则输出"某某某年是闰年"，
        //否则输出"某某某年是平年"。
        int year=1000;
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+"年是闰年");
        }else
            System.out.println(year+"年是平年");

        //3.成绩等级判断：
        //注：考虑成绩的合法性：当不合法成绩时，输出"成绩不合法"
        score=99;
        if(score<0||score>100){
            System.out.println("成绩不合法");
        }else if(score>90){
            System.out.println("优秀");
        }else if(score>80){
            System.out.println("还行");
        }else if(score>60){
            System.out.println("合格");
        }else if(score<60){
            System.out.println("不合格");
        }




    }
}

