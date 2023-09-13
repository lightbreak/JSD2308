package OODay05;

import java.awt.*;

public class Test {
    Test(){}
    Test(String name,int id,String classId){
        name=name;
        id=id;
        classId=classId;
    }


    public static void main(String[] args) {
        point point = new point();
        point.setX(100);
        point.setY(200);
        System.out.println(point.getX()+","+point.getY());
    }
}
