package Day07;//杨辉三角
public class Yanghui {
    public static void main(String[] args) {
        int[][] yanghui=new int[10][];
        for (int i=0;i< yanghui.length;i++){
            yanghui[i]=new int[i+1];//给一维数组yanghui空间
            for (int j=0;j<yanghui[i].length;j++)
            {
                if(j==0||j==yanghui[i].length-1){
                    yanghui[i][j]=1;
                }else {
                yanghui[i][j]=yanghui[i-1][j]+yanghui[i-1][j-1];
                }
            }
        }
        for (int i=0;i< yanghui.length;i++){
            for (int j=0;j<yanghui[i].length;j++) {
                System.out.print(yanghui[i][j]+"\t");
            }
            System.out.println();
        }
    }

    //        int[][]hui=new int[10][];
//        for (int i=0;i<hui.length;i++){
//            hui[i]=new int[i+1];
//            for (int j=0;j<hui[i].length;j++){
//                if (j==0||j==hui[i].length-1){
//                    hui[i][j]=1;
//                }else{
//                    hui[i][j]=hui[i-1][j]+hui[i-1][j-1];
//                }
//            }
//        }
//        for (int i=0;i<hui.length;i++){
//            for (int j=0;j<hui[i].length;j++){
//                System.out.print(hui[i][j]+"\t");
//            }
//            System.out.println();
//        }
//    }
}
