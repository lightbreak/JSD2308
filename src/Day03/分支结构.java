package Day03;

import java.util.Scanner;

//顺序结构————————普通的程序
//循环结构————————for，switch，while
//分支结构
public class 分支结构 {
    public static void main(String[] args) {
        //if结构 一条路
        /*
        boolean T=true;
        if(T) {
            System.out.println("T="+T);//如果条件为true则执行if{}内容
        }
        //if else
        boolean F=false;
        if(F) {
            System.out.println("F="+F);//如果条件为真执行这里
        }
        else {
            System.out.println("F=" + F);}//else，否则执行这里


        //if……else……if（）结构
        if(1>0){
            System.out.println("");
        }else if(F){
            System.out.println("");
        }else if(T){
            System.out.println("");
        }else {
            System.out.println("");
        }

         */

        //满2000打5折，满1000不满2000打7折，满500不满1000打8折，不满500打9折；
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入价格");
        int num= scanner.nextInt();
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


        int a=1;
        switch (a){
            case(1):
                System.out.println();
                break;
            case(0):


        }



    }
}
