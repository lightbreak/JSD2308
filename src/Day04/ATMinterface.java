package Day04;

import java.util.Scanner;

public class ATMinterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        while (true) {
            System.out.println("请选择操作：");
            System.out.println("1. 存款");
            System.out.println("2. 取款");
            System.out.println("3. 查询余额");
            System.out.println("4. 退卡");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("请输入存款金额：");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("存款成功！");
                    break;

                case 2:
                    System.out.println("请输入取款金额：");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("余额不足！");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("取款成功！");
                    }
                    break;

                case 3:
                    System.out.println("当前余额为：" + balance);
                    break;

                case 4:
                    System.out.println("谢谢使用！");
                    return;

                default:
                    System.out.println("无效的选择！");
                    break;
            }
        }
    }
}
