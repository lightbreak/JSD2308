package Day02;//变量 //sc快捷输入


import javax.swing.*;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);//快捷输入sc，创建scanner函数
        System.out.println("键入int");
        int a= scanner.nextInt();//别忘了赋值
        System.out.println(a);
        for (int i=a;i<=10;i++)
        {
            System.out.println("此时i的值为"+i);
            for(int j=a+1;j>0;j--)
            {
                String k="安志宇";
                System.out.println("有"+j+"个"+k);
            }
        }
    }
}
