package OODay02;
//方法的重写Override
public class OverirdeDemo {
    public static void main(String[] args) {
        Student ls=new Student("李四",23,"无垠海","王五","id=1");
        ls.say();

        Doctor ww=new Doctor();
        ww.say("ww",30,"beijing","主任");
    }
}
