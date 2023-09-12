package OODay02;

public class Teacher extends Person{
    String salry;
    Teacher(){}
    Teacher(String name,String salry,int age,String address){
        super(name,age,address);
          this.salry=salry;
//        this.age=age;
//        this.address=adress;
//        this.name=name;
    }

    void  teach(){
        System.out.println();
    }
}
