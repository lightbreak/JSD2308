package OODay02Homework;

public class PersonTset {
    public static void main(String[] args) {
        Doctor d=new Doctor("李医生",30,"翻斗花园","住院医生");
        d.eat();
        d.sayHi();
        d.sleep();
        d.heailing();

        Student s=new Student("李四",20,"花奶牛小学","xss001");
        s.eat();
        s.sayHi();
        s.sleep();
        s.study();

        Teacher t=new Teacher("老师",28,"和平广场",10000);
        t.teach();
        t.sayHi();
        t.sleep();
        t.eat();
    }
}
