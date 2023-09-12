package Day07;

import java.util.Arrays;
import java.util.Scanner;

//主持人大赛，有N位评委；
//选手的最终得分为 去掉最高分和最低分的N-2的平均分Avg；
//训练目标 分支循环 方法
public class CalTotalAvg {
    public static void main(String[] args) {
        double[] scores=inputDate(6);//N=6，有6位评委 录入评分
        double avg=avg(scores);//计算平均分
        System.out.println("平均分为："+avg);
    }


    //录入评委的分
    public static double[] inputDate(int N){
        Scanner scanner=new Scanner(System.in);
        double[]scores=new double[N];
        for (int i=0;i<N;i++){
            System.out.println("输入第"+(i+1)+"评委分数");
            scores[i]=scanner.nextDouble();
        }
        Arrays.sort(scores);
        return scores;
    }

    //求平均分
    public static double avg(double[] scores){
        double avg=0.0;
        scores[0]=0;scores[scores.length-1]=0;
        for (double score : scores) {
            avg += score;
        }
        avg/=(scores.length-2);
        return avg;
    }
}



