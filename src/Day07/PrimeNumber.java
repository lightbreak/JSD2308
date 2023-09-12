package Day07;//素（质）数，除了1和他本身，没有
import java.util.Random;//需求：求2-100的所有素数；
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int num=2;num<=1000;num++){
            prime(num);
//            int flag = 1;
//            //for (int num = 2;num<100; num++) {
//            for (int i = 2; i <=num/2; i++) {//100-num
//                if (num%i==0){
//                    flag = 0;
//                }
//            }if(flag==1){
//                System.out.println(num+"是质数");
//            }//else System.out.println(num+"不是质数");
        }
    }



    public static void prime(int num){
        int flag = 1;
        //for (int num = 2;num<100; num++) {
        for (int i = 2; i <=num/2; i++) {//100-num
            if (num%i==0){
                flag = 0;
            }
        }if(flag==1){
            System.out.println(num+"是质数");
        }//else System.out.println(num+"不是质数");
    }
}

