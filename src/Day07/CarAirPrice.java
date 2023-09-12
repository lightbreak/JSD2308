package Day07;
//机票价格按照不同季节（淡季，旺季），舱位（头等，商务，经济仓收费
// 输入机票原价，月份，舱位，实现不同的折扣
//--旺季5-10月 头等9折 商务85 经济8折
//--淡季1-4，11-12月，头等七折，商务65，经济6折；
//训练目标分支结构

import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;

public class CarAirPrice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入原价");
        double Price=scanner.nextDouble();
        System.out.println("输入月份");
        double month=scanner.nextDouble();
        System.out.println("输入舱位：1.头等舱，2.商务座，3.经济舱");
        int type=scanner.nextInt();
        boolean flag=true;
        flag=check(Price,month,type);//判断输入是否不合法
        if(flag){
        double finPrice=finalPrice(Price,month,type);//输出最终价格
        System.out.println("最终价格为："+finPrice);}
    }
    public static  boolean check(double Price,double month,int type ){
        //判断数据合法
        boolean flag=true;
        if(month<1|month>12){System.out.println("月份不合法");flag=false;}
        if(type<1|type>3){System.out.println("舱位不合法");flag=false;}
        return flag;
    }
    public static double finalPrice(double Price,double month,int type ){
        if(5<=month&month<=10) {//旺季
            switch (type){
                case 1:Price*=0.9;break;
                case 2:Price*=0.85;break;
                case 3:Price*=0.8;break;
            }
        }else {//淡季
            switch (type){
            case 1:Price*=0.7;break;
            case 2:Price*=0.65;break;
            case 3:Price*=0.6;break;
        }
        }
        return Price;
    }

}
