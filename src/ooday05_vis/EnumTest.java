package ooday05_vis;
/** 枚举的测试 */
public class EnumTest {
    public static void main(String[] args) {
        Seasons s = Seasons.WINTER;
        System.out.println(s.getSeasonName()+","+s.getSeasonDesc());
        System.out.println("-------------------");

        Seasons[] seasons = Seasons.values();
        for(int i=0;i<seasons.length;i++){
            System.out.println(seasons[i]); //SPRING
            System.out.println(seasons[i].getSeasonName()); //春天
            System.out.println(seasons[i].getSeasonDesc()); //暖和
        }
    }
}
