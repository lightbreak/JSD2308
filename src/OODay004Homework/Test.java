package OODay004Homework;
//Test：创建Animal数组并填充Dog/Chick/Fish对象，遍历数组：
public class Test {
    public static void main(String[] args) {
        Animal[] animals=new Animal[3];
        animals[0]=new Dog("大黄",2,"黄");
        animals[1]=new Chink("小花",1,"花");
        animals[2]=new Chink("小金",1,"金");
        for (Animal animal : animals) {
            animal.eat();
            animal.drink();
            System.out.println(animal.name);
        }
        for (int i=0;i< animals.length;i++){
            if (animals[i] instanceof Dog) {
                Dog d = (Dog) animals[i];
                d.swim();
                d.lookhome();
            }
            if (animals[i] instanceof Chink){
                Chink c=(Chink) animals[i];
                c.layEgg();
            }
            if (animals[i] instanceof Fish){
                Fish f=(Fish) animals[i];
                f.swim();
                f.eat();
            }
            if (animals[i] instanceof Swim){
                Swim s=(Swim) animals[i];
                s.swim();
            }
        }
        Master m=new Master();
        Dog dog=new Dog("大黄",2,"黄");
        m.feed(dog);

    }
}
