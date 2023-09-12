package Day05;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // 数组的定义
        //s声明整型数组a，包含5个元素，每个元素都是int型，默认值为0；
        int[] a = new int[5];
        //声明浮点型数字d，包含10个元素，每个元素都是double型。默认值是0.0；
        double[] d = new double[10];
        //声明布尔型数组b，包含26个元素，每个元素都是boolean类型，默认值为false；
        boolean[] b = new boolean[26];

        //数组的初始化：初始化数组的元素；
        int[] arr = new int[3];//0、0、0
        int[] arr2 = {2, 5, 8};//2,5,8
        int[] arr3 = new int[]{2, 5, 8};//2,5,8
        //第三个可以分开写，先声明再初始化，其余不行
        int[] arr1;
        arr1 = new int[]{2, 5, 8};

        //下标从0开始,arr[3]====>[0]-[1]-[2]
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        //arr[3]=4;数组下标越界异常

        //输出数组所有元素
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //输出数组所有元素的另一种方法；
        for (int element: arr) {
            System.out.println(element);
        }
        printArray(new int[]{3, 1, 2, 6, 4, 2});

        //计算数组所有元素的和
        int num=0;
        for (int i=0;i<arr.length;i++){
            num+=arr[i];
        }
        System.out.println(num);


        //随机数生成数组
        int[] array=new int[10];
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*1000+1);
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        //查找最大元素
        int max=array[0];
        int min=array[0];
        for (int i=0;i<array.length;i++) {
            if (max<array[i])
                max=array[i];
        else if(min>array[i]){
            min=array[i];
        }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
//Arrays.sort() java封装的排序方法
        Arrays.sort(array);//对array数组做升序排列
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int A=(int)(Math.random()*100+1);

        //数组也可用于函数
       // printArray(new int[]{3, 1, 2, 6, 4, 2});



        //Arrays.sort(array);//排序
        //

}
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
