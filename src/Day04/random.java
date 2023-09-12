package Day04;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)//循环一百次
        {int num=(int)(Math.random()*100+1);//1-100内的随机数
            System.out.println(num);}
        //
        //随机数的另一个方法
        Random random=new Random();
        int[] array=new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
            System.out.println(array[i]);
        }
    }
}
