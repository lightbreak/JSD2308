package Day06;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        int[] a=new int[10];
        a=MaxOfArray(6);//调用MaxofArray方法
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        say();
        String name="名字";
        say(name);
        String  gender="man";
        say(gender,18);
        int d=getNum();
        System.out.println(d);
        int c=plus(1,2);
        System.out.println(c);
        int[] arr=generateArray();
        for (int i = 0; i < a.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] MaxOfArray(int size) {
        //MaxOfArray求数组元素最大值并放在最后一个元素的下一个位置
        // 要求：声明整型数组并填充随机数据，找到最大值，将数组扩容并将最大值放末尾
        Random random = new Random();
        int[] a=new int[size];
        int Max = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        for (int i = 0; i < a.length; i++) {
            if (Max < a[i]) {
                Max = a[i];
            }
        }
            //Arrays.sort(a);//排序
            a = Arrays.copyOf(a, a.length + 1);
            a[a.length-1] = Max;
            return a;
    }

    //定义say()无参无返回值方法，调用测试
    public static void say() {
        System.out.println("say");
    }
    //定义say()有一个参无返回值方法，调用测试
    public static void say(String name) {
        System.out.println("name=" + name);
    }

    //定义say()有两个参无返回值的方法，调用测试
    public static void say(String Gender, int length) {
        System.out.println("Gender=" + Gender + "length=" + length);
    }

    //定义getNum()无参有返回值方法，演示return的用法，调用测试
    public static int getNum() {
        return 0;
    }

    //定义plus()两个参有返回值方法，调用测试
    public static int plus(int a, int b) {
        return a + b;
    }

    //定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试
    public static int[] generateArray()
    {
        Random random = new Random();
        int[] a = new int[random.nextInt(101)];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(101);
        }return a;
    }
}
