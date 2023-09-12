package OODay03Homework;

public class RefArraydemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("小花", 7, "花花");
        dogs[1] = new Dog("小白", 6, "小白");
        dogs[2] = new Dog("小黑", 5, "小黑");
        System.out.println(dogs[0].name);


        Chink[] chinks=new Chink[3];
        chinks[0]= new Chink("小花",4,"花");
        chinks[1]= new Chink("小白",4,"白");
        chinks[2]= new Chink("小黑",4,"黑");
        for (int i=0;i<chinks.length;i++){
            chinks[0].layEgg();
        }

        Fish[] fish=new  Fish[3];
        fish[0]= new Fish("金鱼",4,"金");
        fish[1]= new Fish("白鱼",4,"金");
        fish[2]= new Fish("黑鱼",4,"金");
        for (Fish fish1 : fish) {
            fish1.eat();
            System.out.println(fish1.name);
        }

    }
}
