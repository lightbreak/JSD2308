package Day05;//九九乘法表
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        /*
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("GUI Program");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // 添加组件到窗口
            JLabel label = new JLabel("Hello, World!");
            frame.getContentPane().add(label);

            frame.pack();
            frame.setVisible(true);
        });

         */
        

        Scanner scanner=new Scanner(System.in);
        System.out.println("输入数字");
        int num=scanner.nextInt();
        for (int j=1;j<=num;j++){
        for (int i=1;i<=j;i++){
        System.out.print(i+"*"+j+"="+i*j+"\t");}
        System.out.println();}



         
        //一个界面程序，目前看不懂
/*
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Multiplication Table Program");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(10, 10));

            JTextField inputField = new JTextField();
            JButton generateButton = new JButton("Generate");

            generateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panel.removeAll();
                    String input = inputField.getText();
                    int number;
                    try {
                        number = Integer.parseInt(input);
                        for (int i = 1; i <= 9; i++) {
                            JLabel label = new JLabel(number + " * " + i + " = " + (number * i));
                            panel.add(label);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a number.");
                    }
                    panel.revalidate();
                    panel.repaint();
                }
            });

            frame.add(inputField, BorderLayout.NORTH);
            frame.add(panel, BorderLayout.CENTER);
            frame.add(generateButton, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
        
 */
        
    }
}
