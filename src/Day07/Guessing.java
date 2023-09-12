package Day07;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    //需求：猜数字小游戏
    //训练目标 while（ture） 死循环+break
    public static void main(String[] args) {
        while (true){
            Random rand=new Random(101);
            System.out.println("输入一个100以内的整数");
            int a= rand.nextInt();
            Scanner scanner=new Scanner(System.in);
            int b=scanner.nextInt();
            if(b==a){
                System.out.println();
                break;
            }else if(b<a){
                System.out.println("小了");
            }else if(b>a){//?
                System.out.println("大了");
            }
        }
    }
}
