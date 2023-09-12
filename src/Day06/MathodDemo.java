package Day06;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Random;

public class MathodDemo {
    public static void main(String[] args) {
        //方法say
        say();
        int num1=1;int num2=4;
        //方法Max
        num1=Max(num1,num2);
        System.out.println(num1);
        //方法name;
        name("kami");
        //方法getNum
        double c=getNum();

    }
    //无参无返回值方法
    public static void say(){
        System.out.println("hi");
    }

    //有参有返回值方法
    public static int Max(int a,int b){
        a=a>b?a:b;
        return a;
    }
    //有参无返回值方法
    public static void  name(String name){
        System.out.println("name="+name);
    }
    //无参有返回值
    public static  double getNum(){
        return  8.88;
        }
    //生成有个整型数据，并填充随机数据
    public static int[] generateArray(int len,int max){
        int array[]=new int[len];
        Random random=new Random();
        for (int i=0;i<len;i++){
            array[i]= random.nextInt(max+1);
        }
        return array;}
    //重载
    public  static  void say(String name){
        System.out.println("name="+name);
    }
    public  static  void  say(String name,int age){
        System.out.println("name="+name+"age="+age);
    }
    public static  void say(int age){
        System.out.println("age="+age);
    }
}

