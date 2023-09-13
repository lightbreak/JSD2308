package OODay05;
/*标准javabean的规范
成员变量私有,同时提供公开的getter/setter
包含公开的无参构造方法


设计getter setter的原因
行业标准,很多框架都是基于getter/setter设计的,没有他没法获得数据;
更好的保护数据合法性,可以做到条件控制;
getter/setter可选择性存在,比如只有getter(只读),只有setter(只写);
 */
public class point {
    private int x;
    private int y;
    public  point(){//公开的无参构造
    }
    public int  getX(){//getter
        return x;
    }
    public void setX(int x) {//setter
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

