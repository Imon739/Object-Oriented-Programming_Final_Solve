package Num_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int count=3;
    public static void main(String[] args) {
        JFrame fr=new JFrame("Run");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250,100);
        JLabel label= new JLabel();
        JButton button=new JButton("Click");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(count==0){
                    label.setText("GO!");
                    return;
                }
                label.setText(count+"...");
                count--;
            }
        });
        label.setSize(50,20);
        button.setSize(70,30);
        fr.setLayout(new FlowLayout());
        fr.add(label);
        fr.add(button);
        fr.setVisible(true);
    }
}
