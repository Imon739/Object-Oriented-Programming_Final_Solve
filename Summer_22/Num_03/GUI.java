package Num_03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame jFrame = new JFrame();
    JTextField textField1 = new JTextField("0");
    JLabel label1 = new JLabel();
    JTextField textField2 = new JTextField("0");
    JLabel label2 = new JLabel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    public GUI() {
        jFrame.setBounds(700, 200, 400, 400);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        label1.setBounds(50, 50, 40,30);
        label1.setText("Foot");
        jFrame.add(label1);
        textField1.setBounds(95, 40, 250, 50);
        jFrame.add(textField1);
        button1.setBounds(10, 150, 180, 50);
        button1.setText("Convert To Inch");
        jFrame.add(button1);
        button2.setBounds(190, 150, 180, 50);
        button2.setText("Convert To Foot");
        jFrame.add(button2);
        label2.setBounds(50, 260, 40, 30);
        label2.setText("Inch");
        jFrame.add(label2);
        textField2.setBounds(95, 250, 250, 50);
        jFrame.add(textField2);

        button1.addActionListener(this);
        button2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            double foot = Double.parseDouble(textField1.getText());
            foot = foot*12;
            textField2.setText(String.valueOf(foot));
        }
        if (e.getSource() == button2) {
            double inch = Double.parseDouble(textField2.getText());
            inch = inch/12;
            textField1.setText(String.valueOf(inch));
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}