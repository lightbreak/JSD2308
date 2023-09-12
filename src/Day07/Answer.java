package Day07;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 猜数字
        System.out.println("=== 猜数字 ===");
        guessNumber(scanner);

        // 2. 生成N位验证码
        System.out.println("=== 生成验证码 ===");
        generateVerificationCode(scanner);

        // 3. 找到2到100之内的所有素数
        System.out.println("=== 寻找素数 ===");
        findPrimeNumbers();

        // 4. 飞机票打折
        System.out.println("=== 飞机票打折 ===");
        calculateDiscountedPrice(scanner);

        // 5. 评委打分:去掉最高分和最低分之后的平均分
        System.out.println("=== 评委打分 ===");
        calculateAverageScore(scanner);
    }

    private static void guessNumber(Scanner scanner) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;

        do {
            System.out.print("猜一个1到100的数字：");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("猜小了！");
            } else if (guess > randomNumber) {
                System.out.println("猜大了！");
            } else {
                System.out.println("恭喜你，猜对了！");
                System.out.println("你猜了" + attempts + "次。");
            }
        } while (guess != randomNumber);
    }

    private static void generateVerificationCode(Scanner scanner) {
        System.out.print("请输入验证码位数：");
        int numberOfDigits = scanner.nextInt();
        String verificationCode = generateVerificationCode(numberOfDigits);
        System.out.println("生成的" + numberOfDigits + "位验证码为：" + verificationCode);
    }

    private static String generateVerificationCode(int numberOfDigits) {
        StringBuilder code = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < numberOfDigits; i++) {
            int digit = random.nextInt(10);
            code.append(digit);
        }

        return code.toString();
    }

    private static void findPrimeNumbers() {
        int start = 2;
        int end = 100;

        System.out.println(start + "到" + end + "之间的素数有：");
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void calculateDiscountedPrice(Scanner scanner) {
        System.out.print("请输入原始票价：");
        double originalPrice = scanner.nextDouble();
        System.out.print("请输入折扣（0到1之间）：");
        double discount = scanner.nextDouble();

        double discountedPrice = calculateDiscountedPrice(originalPrice, discount);
        System.out.println("折后票价为：" + discountedPrice);
    }

    private static double calculateDiscountedPrice(double originalPrice, double discount) {
        return originalPrice * discount;
    }

    private static void calculateAverageScore(Scanner scanner) {
        System.out.print("请输入评委人数：");
        int numberOfJudges = scanner.nextInt();

        double[] scores = new double[numberOfJudges];
        for (int i = 0; i < numberOfJudges; i++) {
            System.out.print("请输入第" + (i + 1) + "位评委的分数：");
            scores[i] = scanner.nextDouble();
        }

        double averageScore = calculateAverageScore(scores);
        System.out.println("去掉最高分和最低分后的平均分为：" + averageScore);
    }

    private static double calculateAverageScore(double[] scores) {
        Arrays.sort(scores);
        double sum = 0;
        for (int i = 1; i < scores.length - 1; i++) {
            sum += scores[i];
        }
        return sum / (scores.length - 2);
    }
}