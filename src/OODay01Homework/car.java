package OODay01Homework;
//2. Car类和CarTest类：
//
//   - Car类：brand(品牌)，color，price，构造方法()，start()、run()、stop()
//
//   - CarTest类：创建对象，访问测试

public class car {
    String brand;
    String color;
    int price;

    car(){}
    car(String brand,String color,int price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }
    void start(){
        System.out.println(brand+"牌子的"+color+"颜色的"+price+"块钱的车动了");
    }
    void run(){
        System.out.println(brand+"牌子的"+color+"颜色的"+price+"块钱的车跑了");
    }
    void  stop(){
        System.out.println(brand+"牌子的"+color+"颜色的"+price+"块钱的车停了");
    }

}
