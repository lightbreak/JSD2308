package OODay01;

public class CarTest {
    public static void main(String[] args) {
        Car h=new Car();
        h.brand="benz";
        h.color="黑";
        h.price=10;
        h.start();
        h.run();
        h.stop();


        Car d=new Car("bmw","红色",10);
        d.run();
        d.start();
        d.stop();
    }
}
