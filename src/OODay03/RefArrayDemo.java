package OODay03;

//引入数据类型的演示
public class RefArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];//声明Dog类型数组dogs，包含3个元素
        dogs[0] = new Dog("安", 2, "黑");//
        dogs[1] = new Dog("志", 2, "白");
        dogs[2] = new Dog("宇", 23, "上黑中黄");
        System.out.println(dogs[0].name);
        dogs[1].swim();
        for (Dog dog : dogs) {
            System.out.println(dog.name);
            //dogs[i].eat();
        }
        dogs[2].eat();
        System.out.println("----------------------------------------------------------------------");
        Chick[] chicks = new Chick[3];
        chicks[0] = new Chick("花", 2, "花");
        chicks[1] = new Chick("白", 2, "白");
        chicks[2] = new Chick("黑", 2, "黑");
        for (Chick chick : chicks) {
            System.out.println(chick.name);
            chick.layEggs();
        }
        System.out.println("----------------------------------------------------------------------");
        Fish[] fish = new Fish[4];
        fish[0] = new Fish("金", 1, "金");
        fish[1] = new Fish("黑", 1, "黑");
        fish[2] = new Fish("安", 1, "黄");
        fish[3] = new Fish("白", 1, "白");
        for (Fish value : fish) {
            System.out.println(value.name);
            value.swim();
        }
        //fish.for增强for


    }
}
