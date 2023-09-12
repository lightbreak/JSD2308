package Day05;

import java.util.Scanner;
import java.util.Random;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //基础算数
        /*
        int score=0;
        for(int i=1;i<=5;i++){//循环十次
            //出题 答题 判题
            int N1=(int) (Math.random()*100);//0-99的随机数
            int N2=(int) (Math.random()*100);
            System.out.println(N1+"+"+N2+"="+"?");
            int Result=scanner.nextInt();
            if(Result==(N1+N2)){
                System.out.println("答对了");
                score+=10;
            }else
            {System.out.println("答错了");
            score=0;
                System.out.println("分数清零");}
        }
        System.out.println("总分为"+score);

         */


//时间限制算术题
        /*
        int score=0;
        for(int i=5;i>0;i--) {
            // 生成两个随机数
            Random random = new Random();
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);

            // 生成一个随机的运算符（+、-、*、/）
            char operator;
            int operatorCode = random.nextInt(4);
            switch (operatorCode) {
                case 0:
                    operator = '+';
                    break;
                case 1:
                    operator = '-';
                    break;
                case 2:
                    operator = '*';
                    break;
                case 3:
                    operator = '/';
                    break;
                default:
                    operator = '+';
            }

            // 计算结果
            int result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    result = num1 + num2;
            }

            // 输出题目
            System.out.println("请在规定时间内计算出以下算术题的结果：");
            System.out.println("输入不合法会报错，结果为整数");
            System.out.println(num1 + " " + operator + " " + num2 + " = ?");

            // 设置时间限制（单位：秒）
            int timeLimit = 100;

            // 开始计时
            long startTime = System.currentTimeMillis();
            // 接收用户输入
            System.out.println("还剩"+i+"次");
            System.out.println("正确答案是"+result);
            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();

            // 停止计时
            long endTime = System.currentTimeMillis();
            double elapsedTime = (endTime - startTime) / 1000.0;

            // 判断答案是否正确
            if (userAnswer == result && elapsedTime <= timeLimit) {
                System.out.println("恭喜你，回答正确！");
                score+=10;
            } else if (userAnswer != result) {
                System.out.println("回答错误！");
                System.out.println("分数清零,次数重置");
                score=0;
                i=5;
            } else if (elapsedTime > timeLimit) {
                System.out.println("时间已经超过限制！");
                System.out.println("分数清零，次数重置");
                score=0;
                i=5;
            }

            // 输出正确答案
            System.out.println("正确答案是：" + result);

        }
        System.out.println("总分为"+(score));

         */


        //break 跳出循环
        /*
        for (int j=1;j<10;j++){
            System.out.println(j+"*9="+j*9);
            if(j==5){
                break;
            }
        }
        System.out.println(" ");

        //continue 跳出循环进入下一次循环
        for (int j=1;j<10;j++){
            if(j==5){
                continue;
            }
            System.out.println(j+"*9="+j*9);
        }

         */

        //帅气的倒计时

        int countdown = 10;

        for (int i = countdown; i >= 0; i--) {
            System.out.print("\r倒计时: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n倒计时结束！");

            }
        }

