package Day06;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //数组的复制
        int a[]=new int[]{10,20,30,40,50,60};
        int b[]=new  int[6];//0,0,0,0,0,0;
        //a:源数组
        //1：源数组的起始下标
        //b：目标数组
        //0：目标数组的其实下标
        //4：要复制的元素个数
        System.arraycopy(a,1,b,0,4);
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);}
        System.out.println("完");

            //数组的扩容
        a=Arrays.copyOf(a,a.length+1);
        //数组复制，扩容
        int[] c=Arrays.copyOf(a,7);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }


    }
}
