package Day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {


//1. Addition随机加法运算器
//要求：由系统随机出10道加法题，而后由用户来答题，答题后输出"答对了"或"答错了"，答对1题
//得10分，答错1题不扣分，最后输出总分数。
        /*
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);
        int result=0;
        for (int i = 0; i < 10; i++){
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            System.out.println(a+"+"+b+"=");
            int num=scanner.nextInt();
            if (num==a+b){
                System.out.println("答对了");
                result+=10;
            }else
                System.out.println("答错了");
        }
        System.out.println("总分是"+result);

         */


//2. MultiTable九九乘法表
//要求：输出九九乘法表
       /*
        for(int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println("");
        }

        */



//3. 数组小代码练习：声明、初始化、访问、遍历
        /*
        int Ar[];
        int ar[]=new int[2];
        int arr[]=new int[]{1,2,3};
        boolean arry[]=new boolean[2];

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
  //给数组随机赋值，并输出
        for (int i=1;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        for (int i=1;i< arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
            System.out.println(arr[i]);
        }

         */


        //复合数组,算了，不对
//        int arrays[][]=new int[3][4];
//        for (int i=1;i< arrays.length;i++){
//            for (int j=1;j< arrays.length;j++){
//                arrays[i][j]=(int)(Math.random()*10);
//        System.out.println(arrays[i][j]);
//            }
//        }




//4. MaxOfArray求数组元素最大值
        /*
        int[] Array=new int[10];
        for (int i=1;i< Array.length;i++){
            Array[i]=(int)(Math.random()*100+1);
            System.out.println(Array[i]);
        }
        System.out.println("");
        int MaxofArray=Array[0];
        for (int i=0;i<Array.length;i++){
            if(MaxofArray<Array[i]){
                MaxofArray=Array[i];
            }
        }
        System.out.println("Max="+MaxofArray);

         */





//5. 对数组进行升序排列，并输出排序后的结果
//参考
        /*
        Arrays.sort(Array);
        for (int i=0;i<Array.length;i++){
            System.out.println(Array[i]);
        }

         */



//拓展
        //1. 利用for循环计算：求数字1到100之内，所有偶数的和，并输出
        /*
        int Result=0;
        for (int i=0;i<=100;i++){
            if(i%2==0){
                Result=i+Result;//Result+=i;
            }
        }System.out.println(Result);

         */




        //2. 利用for循环计算：求8的阶乘，并输出
        /*
        int Result=1;
        for (int i=8;i>0;i--){
            Result*=i;
            System.out.println(Result+"*");
        }
        System.out.println(Result);//40320

         */

        //3. 利用for循环计算：打印字符*组成的直角三角形，输出结果如下所示：*
        //***
        //*****
        //*******
        //*********
        //***********
        /*
        for (int i=1;i<10;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

         */
/* i   j
   1   1 2i-1=1;
   2   3 2i-1=3;
   3    5 2i-1=5;
   4    7
   */

        //4. 定义数组，包含10个元素，随机生成数据(范围自拟)，查找最大值和最小值，并输出

        int[] A=new int[10];
        Random random=new Random();
        for (int i=0;i<A.length;i++){
            A[i]= random.nextInt(101);
            System.out.println(A[i]);
        }
        int Max=0;
        int Min=0;
        for (int j=0;j<A.length;j++){
            if(Max<A[j]){
                Max=A[j];
            }else if(Min>A[j]){
                Min=A[j];
            }
        }System.out.println("Max="+Max+"\t"+"Min="+Min);


    }
}
