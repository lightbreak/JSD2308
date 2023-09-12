package OODay03Homework;

public class RefArraydemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0].name = "小花狗";
        System.out.println(dogs[0].name);
        dogs[0] = new Dog("小花", 7, "花花");
        dogs[1] = new Dog("小白", 6, "小白");
        dogs[2] = new Dog("小黑", 5, "小黑");




    }
}
