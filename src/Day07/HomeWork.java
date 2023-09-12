package Day07;
//1. 猜数字
//2. 生成N位验证码
//3. 找到2到100之内的所有素数
//4. 飞机票打折
//5. 评委打分:去掉最高分和最低分之后的平均分

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        int n = 4;
       //猜数字
        gessing();
        //验证码
        verificationcode(n);
        //找素数
        PrimeNum();
        //机票价格
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入原始价格");
        double price=scanner.nextDouble();
        System.out.println("输入月份");
        int mouth=scanner.nextInt();
        System.out.println("输入1.头等舱，2公务舱，3.经济舱");
        int type=scanner.nextInt();
        price=AirPrice(price,mouth,type);
        //评委打分
        int num=5;//定义评委人数
        int avg=avg(num);//求平均数
        System.out.println("平均数为"+avg);

    }

    public static void gessing() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("猜一个1到100的数字。");

        while (true) {
            System.out.print("请输入你的猜测：");
            guess = scanner.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("太大了！请再试一次。");
            } else if (guess < number) {
                System.out.println("太小了！请再试一次。");
            } else {
                System.out.println("恭喜你，猜对了！");
                System.out.println("你猜了 " + attempts + " 次。");
                break;
            }
        }

        scanner.close();
    }

    public static void verificationcode(int n) {
        String code = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        String VerCode = "";

        for (int i = 0; i < n; i++) {
            VerCode += code.charAt(random.nextInt(code.length()));
        }

        System.out.println("生成的验证码是：" + VerCode);
    }

    public static void PrimeNum() {
        System.out.println("2到100的质数有：");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
    }

//4. 飞机票打折
    public static double AirPrice(double price,int month,int type){
        if(5<=month&month<=10) {//旺季
            switch (type){
                case 1:price*=0.9;break;
                case 2:price*=0.85;break;
                case 3:price*=0.8;break;
            }
        }else {//淡季
            switch (type){
                case 1:price*=0.7;break;
                case 2:price*=0.65;break;
                case 3:price*=0.6;break;
            }
        }
        return price;
    }

//5. 评委打分:去掉最高分和最低分之后的平均分
    public  static int avg(int num){
        Scanner scanner=new Scanner(System.in);
        int[] score=new int[num];
        for (int i=0;i<score.length;i++){
            System.out.println("输入第"+(i+1)+"位评委的分数");
         score[i]=scanner.nextInt();
        }
        Arrays.sort(score);//排序
        score[0]=0;score[score.length-1]=0;//把最高分和最低分剔除
        int Total=0;
        for (int i=0;i<score.length;i++){//把数组的值赋给总分
            Total+=score[i];
        }
        int avg=Total/(num-2);
        return avg;
    }


}
//找不到哪里报错，重新写了一遍
//        int num = gessing();
//        String num1 = verificationcode(8);
//        System.out.println(num1);
//    }
//}
//
//
//    //1. 猜数字
//    public static int gessing() {
//        Random rand = new Random();
//        Scanner scanner = new Scanner(System.in);
//        int num = rand.nextInt(101);
//        while (true) {
//            System.out.println("输入一个数");
//            int Scanner = scanner.nextInt();
//            if (Scanner < num) {
//                System.out.println("小了");
//            } else if (Scanner > num) {
//                System.out.println("大了");
//            } else {
//                System.out.println("答对了");
//                break;
//            }
//        }
//        return num;
//    }
//
//    //2. 生成N位验证码
//    public static String verificationcode(int size) {
//        Random random = new Random();
//        String VerCode = "";
//        char[] code = new char[]{'a', 'b', 'c', 'd', '1', '2',
//                '3', '4', '5', '6', '7', 'A', 'B', 'C', 'D'};
//        for (int i = 0; i < size; i++) {
//            VerCode += code[random.nextInt(code.length - 1)];
//        }
//        return VerCode;
//    }
//
//
//    //3. 找到2到100之内的所有素数
//    public static void PrimeNum()
//    {
//        for (int num = 2; num <= 1000; num++)
//        {
//            int flag = 1;
//            //for (int num = 2;num<100; num++) {
//            for (int i = 2; i <= num / 2; i++)
//            {//100-num
//                if (num % i == 0)
//                {
//                    flag = 0;
//                }
//            }
//            if (flag == 1)
//            {
//                System.out.println(num + "是质数");
//            }
//        }
//    }

//    public static void PrimeNum() {
//        for (int num = 2; num <= 1000; num++) {
//            int flag = 1;
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    flag = 0;
//                    break;
//                }
//            }
//            if (flag == 1) {
//                System.out.println(num + "是质数");
//            }
//        }
//    }




