package OODay03Homework;

//达内员工管理系统设计：---------------------1遍
//
//需求:
//1)教研总监:名字、年龄、工资、上班打卡()、下班打卡()、完成工作()、
//          解决企业问题()、培训企业员工()、编辑书籍()
//2)讲师:名字、年龄、工资、上班打卡()、下班打卡()、完成工作()、
//       解决企业问题()、培训企业员工()、编辑书籍()
//3)项目经理:名字、年龄、工资、上班打卡()、下班打卡()、完成工作()、
//          编辑书籍()
//4)班主任:名字、年龄、工资、上班打卡()、下班打卡()、完成工作()
public class TeDu {
    //1.父类
    public static abstract class work{
        String  name;
        int age;
        int salary;
        work(){}
        work(String  name,int age,int salary){
            this.name=name;
            this.age=age;
            this.salary=salary;
        }
        void 上班打卡(){}
        void  下班打卡(){}
        abstract void 完成工作();//因为每个人工作不同，所以要重写抽象方法
    }
    public static abstract class guanli extends TeDu {}
    interface 培训企业员工 {

        void 培训企业员工();

    }

    interface 解决企业问题 {

        void 解决企业问题();

    }

    interface 编辑书籍{

        void 编辑书籍();

    }

    class 教研总监 extends work implements 培训企业员工, 解决企业问题, 编辑书籍 {
        public void 编辑书籍(){}
        public void 培训企业员工(){}
        public void 解决企业问题(){}
        void 完成工作(){}
    }

    class 讲师 extends work implements 培训企业员工, 解决企业问题, 编辑书籍 {

        public void 编辑书籍(){}
        public void 培训企业员工(){}
        public void 解决企业问题(){}
        void 完成工作(){}
    }

    class 项目经理 extends work implements 编辑书籍 {
        public void 编辑书籍(){}
        void 完成工作(){}
    }

    class 班主任 extends work {
        void 完成工作(){}
    }
}
