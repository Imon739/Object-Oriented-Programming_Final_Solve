package Q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        JFrame frame=new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(new GridLayout(2,2));
        JButton[] buttons=new JButton[4];
        for(int i=0;i<4;i++){
            buttons[i]=new JButton();
            buttons[i].setSize(50,50);
            frame.add(buttons[i]);
        }
        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons[0].setText("1");
                buttons[1].setText("2");
                buttons[2].setText("3");
                buttons[3].setText("4");
            }
        });
        buttons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons[0].setText("1");
                buttons[1].setText("3");
                buttons[2].setText("2");
                buttons[3].setText("4");
            }
        });
        frame.setVisible(true);
    }
}
