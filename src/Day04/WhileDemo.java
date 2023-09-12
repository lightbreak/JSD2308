package Day04;
import java.util.Random;
import java.util.Scanner;

public class WhileDemo {//while ----do while 当循环变量的初始化和循环变量的改变一致时，多用do while
    public static void main(String[] args) {
        Random random = new Random();//猜数字
        int randomNumber = random.nextInt(100) + 1; // 生成1到100之间的随机数
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("猜一个1到100之间的随机数。");

        while (true) {
            System.out.print("请输入你的猜测：");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guess < randomNumber) {
                System.out.println("猜的数字太小了，请再试一次。");
            } else {
                System.out.println("猜的数字太大了，请再试一次。");
            }
        }

        System.out.println("你总共猜了 " + attempts + " 次。");
    }

}


