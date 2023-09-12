package Day02;

public class Anwser {
    public static void main(String[] args) {
          /*
    声明一个变量，一次声明多个变量。
    声明变量直接初始化，先声明变量，而后再给变量初始化。
    声明整型变量g，声明另一个整型变量h并赋值为g+10，输出变量h的值。
    在g本身基础之上增10，输出变量g的值。
    声明一些正确的和错误的变量名。
     */
        int a, b, c;
        int A;
        int g = 10;
        int h = g + 10;
        System.out.println(h);//20
        g = g + 10;
        System.out.println(g);//20
        //int class=1;//错误的，不能用类名做变量
        int 蔡非凡 = 0;//xianran

        /*
        声明初始化两个以上整数变量，并且输出两个整数变量的除法结果
        声明两个很大的变量，然后相加，输出运算结果，测试运算溢出现象
        */
        int i = 10;
        int j = 22;
        System.out.println(j - i);//12
        int k = 2147483647;
        int l = 1111;
        System.out.println(k + l);//-2147482538 溢出


        //声明初始化两个以上的长整型变量
        //声明变量存储几个较大数据的运算，演示：若有可能溢出建议将L设计在第1个数字后。
        long L1 = 199999999L;
        long L2 = 2999999999999999999L;
        System.out.println(L1 * L2);
        long L3 = 2000000000L + 110 * 1000909;


        //声明初始化两个以上的浮点型变量
        //声明几个浮点型变量并将它们做数学操作，演示double运算的舍入误差问题
        double D1 = 2.99;
        double D2 = 3.11;
        float F1 = 2.11F;
        double D3 = D1 + D2 * D1;
        System.out.println(D1 + D2);//6.1
        System.out.println(D1 - D2);//-0.11999999999999966
        System.out.println(D3);//12.2889


        //声明初始化两个以上的布尔型变量
        boolean B1 = true;
        boolean B2 = false;

        //声明初始化五个以上的字符型变量
        //声明字符型变量，演示转义符
        char C1 = 'j';
        char C2 = '人';
        char C3 = '4';
        char C4 = ' ';
        char C5 = 'A';
        char C6 = '\\';
        //char C3='ren'; 错


        //声明几个变量，演示自动类型转换和强制类型转换的语法
        //声明一个较大类型的长整型变量，演示强转可能会发生的溢出问题
        //声明一个较大精度的浮点型变量，演示强转可能会发生的丢失精度问题
        int I1 = 1244;
        long L5 = 2886678;
        double D7 = 8.88888888;
        float F4 = 1.22f;
        char C9 = '赣';
        int I2 = C9 + 1;
        L5 = (long) (D7 + F4);
        System.out.println(L5);//10


        //声明两个byte型变量b1和b2，并赋值为直接量
        //声明一个byte型变量，并赋值为b1与b2的和
        byte b1 = 4;
        byte b2 = 3;
        //byte b3=b1+b2;错，会变成int
        byte b3 = (byte) (b1 + b2);
    }
}
