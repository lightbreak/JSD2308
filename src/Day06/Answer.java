package Day06;
import java.util.Arrays;
import java.util.Random;

public class Answer {
    public static void main(String[] args) {
        /*
        // 测试say()无参无返回值方法
        say();

        // 测试say()有一个参无返回值方法
        say("Hello!");

        // 测试say()有两个参无返回值的方法
        say("Hello", "World!");

        // 测试getNum()无参有返回值方法
        int num = getNum();
        System.out.println("Returned number: " + num);

        // 测试plus()两个参有返回值方法
        int result = plus(5, 3);
        System.out.println("Sum of two numbers: " + result);

         */

        // 测试generateArray()方法
        int[] array = generateArray(10);
        System.out.println("array: " + Arrays.toString(array));

        int max = findMax(array);
        System.out.println("Maximum: " + max);

        expandAndMoveMax(array);
        System.out.println("Modified array: " + Arrays.toString(array));
    }

    // 定义say()无参无返回值方法
    public static void say() {
        System.out.println("Hello!");
    }

    // 定义say()有一个参无返回值方法
    public static void say(String message) {
        System.out.println(message);
    }

    // 定义say()有两个参无返回值的方法
    public static void say(String message1, String message2) {
        System.out.println(message1 + " " + message2);
    }

    // 定义getNum()无参有返回值方法
    public static int getNum() {
        return 10;
    }

    // 定义plus()两个参有返回值方法
    public static int plus(int a, int b) {
        return a + b;
    }
    // 定义生成整型数组并填充随机数的方法
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // 生成0到99的随机数
        }

        return array;
    }

    // 定义找到数组中最大值的方法
    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    // 定义将最大值放在数组末尾的方法
    public static void expandAndMoveMax(int[] array) {
        int max = findMax(array);
        // 扩容数组
        array=Arrays.copyOf(array,array.length+1);
        // 将最大值放在末尾的下一个位置
        array[array.length-1] = max;
    }
}


