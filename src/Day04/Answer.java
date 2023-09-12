package Day04;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //CommandBySwitch命令解析程序：
        //要求：接收用户输入的命令，依据命令做不同的操作
        /*
        int a=1;
        switch (a){
            case 1:
            System.out.println(a);
            break;
            case 2:
                System.out.println(a+1);
                break;
            default:
                System.out.println("over");
        }


         */
        //2. Guessing猜数字之while版：
        //要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用
        //while来实现。

        /*
        int num=(int)(Math.random()*100+1);

        System.out.println("输入一个数");
        boolean flag=false;
        while (!flag) {
            int Num = scanner.nextInt();
            if(num<Num)
                System.out.println("大了");
            else if(num>Num)
                System.out.println("小了");
            else {
                System.out.println("猜对了"+(Num));
                flag=true;
            }
        }

         */



        //3. Guessing猜数字之do...while版
        //要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用
        //do...while来实现。
        /*
        int num1=(int)(Math.random()*100+1);
        System.out.println("输入一个数");
        boolean flag1=false;
     do {
            int Num = scanner.nextInt();
            if(num1<Num)
                System.out.println("大了");
            else if(num1>Num)
                System.out.println("小了");
            else {
                System.out.println("猜对了"+(Num));
                flag1=true;
            }
        }while (!flag1);

         */
        //4. for循环：输出5次"行动是成功的阶梯"、输出9的乘法表(1到9、1/3/5/7/9、9到1)
       /*
        for (int i=0;i<5;i++){
            System.out.println("行动是成功的阶梯"+i);}
        for (int i=1;i<10;i++){
            System.out.println(i+"*"+i+"="+(i*i));}
        for (int i=1;i<10;i+=2){
            System.out.println(i+"*"+i+"="+(i*i));
        }
        for (int i=9;i>0;i--){
            System.out.println(i+"*"+i+"="+(i*i));
        }

        */

//拓展
        //1. 接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"
/*
        int num=scanner.nextInt();
        if(num==0){
            System.out.println("0");
        }else if(num>0){
            System.out.println("+");
        }else if(num<0){
            System.out.println("_");
        }

 */

        //2. 接收用户输入的年份year和月份month，计算该年该月的天数，并输出
        /*
        System.out.println("请输入年份");
        int year=scanner.nextInt();
        System.out.println("请输入月份,月份必须在1-12内，否则会报错");
        int month=scanner.nextInt();
        month=month-1;//数组从0开始；
        int[] day=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};//数组储存月份
        if((year%100!=0&&year%4==0)||year%400==0)//判断闰年
        {
            if ((month) == 1) {//如果是闰年，且是二月，day=29；
                day[2]= 29;
            }
        }//不是闰年

//       if ((month % 2 != 0||month<=8) && month == 12){//且是1，3，5，7，8，10，12月 day=31
//           day=31;
//            }else if (month%2==0&&month==11){//是2，4，6，9，11月 day=30
//           day=30;
//       }else if(month==2){ // 平年2月 day=28
//           day=28;
//       }}
        System.out.println("在"+year+"年"+(month+1)+"月"+"有"+day[month+1]+"天");

         */

        //3. 输出1900到2023年之间所有的闰年(每够10个年份，换一行)
        int i=0;
        for(int year1=1900;year1<=2023;year1++) {
                if((year1%100!=0&&year1%4==0)||year1%400==0)
            {
                System.out.print(year1+"\t");
                 i++;
                 if(i%10==0){
                     System.out.println("");
                 }
            }
        }


    }
}
