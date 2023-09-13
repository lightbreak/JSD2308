package OODay05;

public class SeasonTest {
    public static void main(String[] args) {
        Season[] seasons=Season.values();//获取所有的枚举对象
        for (Season season : seasons) {
            System.out.println(season);
        }
        Season s = Season.WINTER; //获取WINTER对象
        switch(s){
            case SPRING:
                System.out.println("春天到了...");
                break;
            case SUMMER:
                System.out.println("夏天到了...");
                break;
            case AUTUMN:
                System.out.println("秋天到了...");
                break;
            case WINTER:
                System.out.println("冬天到了...");
        }
    }




}
