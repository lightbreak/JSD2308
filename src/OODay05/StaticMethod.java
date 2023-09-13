package OODay05;
//静态方法的演示
public class StaticMethod {
int a;//实例变量(
static int b;//静态变量
void show(){//有隐式this
    System.out.println(this.a);
    b++;
    System.out.println(StaticMethod.b);
}
    //在say()中需要访问对象的属性a,所以认为say的操作于对象有关,不适合设计为静态方法
    void say(){
        System.out.println(a);
    }
    //在plus中不需要访问对象的属性行为(变量方法),所以plus的操作与对象无关,所以设置为静态方法
    static  int plus(int num,int num2){
    num=num2;
    return num;
    }
static void test(){//没有隐式this
    //静态方法中没有隐式this传递,没有this就意味着没有对象
    //而实例变量a必须通过对象来访问,所以如下语句发生编译错误;
    //System.out.println(a);,静态方法不能直接访问实例或实例成员;
    System.out.println(StaticMethod.b);

}
}
