package Day07;//验证码

import java.util.Random;

public class verificationCode {
    //生成n位验证码，包含大小写字母，数字
    //数组+方法
    public static void main(String[] args) {
        String Vercode=GenerateVeriCode(4);
        System.out.println(Vercode);
    }
    public static String GenerateVeriCode(int size){
        Random random=new Random();
        String VerCode="";
//        String[] arr=new String[size];
//        for(int i=0;i<size;i++){
//            arr[random.nextInt(size)]=random.toString();
//            //char a=(char)(random.nextInt());}//大写字母65-90，小写是97-122；}
        char[] chs={'a','b','c','d','e','f','g','h','i','j','k','l','m',
                    'A','B','C','D','E','F','G','1','2','3','4','5','6','7','8'};
        for(int i=0;i<size;i++){
            VerCode += chs[random.nextInt(chs.length)];
        }
            return VerCode;
    }
}

