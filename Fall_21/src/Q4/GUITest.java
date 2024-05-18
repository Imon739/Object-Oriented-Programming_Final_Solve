package Q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITest {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(275,120);
        JTextField tf1=new JTextField(10);
        JTextField tf2=new JTextField(10);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        JButton button=new JButton("Swap!");
        button.setSize(50,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1=tf1.getText();
                String s2=tf2.getText();
                tf1.setText(s2);
                tf2.setText(s1);
            }
        });
        frame.add(tf1);
        frame.add(tf2);
        frame.add(button);
    }
}
