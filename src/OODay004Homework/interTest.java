package OODay004Homework;
//创建接口Inter
//创建接口InterInter，包含抽象方法show()
// 创建类InnerTest，在main中：创建2个Inter的匿名内部类对象，创建两个InterInter的匿名内部类对象
public interface interTest {
    public static void main(String[] args) {
        inter i=new inter(){};
        inter i1=new inter(){};
        inter.interinter i2=new inter.interinter() {
            @Override
            public void show() {
                System.out.println("这是interinter1");
            }
        };
        inter.interinter i3=new inter.interinter() {
            @Override
            public void show() {
                System.out.println("这是interinter2");
            }
        };
        i2.show();
        i3.show();
    }
}

interface inter{
    interface interinter{
       abstract void show();
    }
}