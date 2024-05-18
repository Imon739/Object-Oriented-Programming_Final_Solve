import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public JFrame myFrame;
    public JButton add,subtract;
    public JTextField N1,N2,Result;
    GUI(){
        add=new JButton();
        subtract=new JButton();
        N1=new JTextField();
        N2=new JTextField();
        Result=new JTextField();
        myFrame=new JFrame();
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number1=Integer.parseInt(N1.getText());
                int number2=Integer.parseInt(N2.getText());
                int res=number1+number2;
                Result.setText(res+" ");
            }
        });
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number1=Integer.parseInt(N1.getText());
                int number2=Integer.parseInt(N2.getText());
                int res=number1-number2;
                Result.setText(res+" ");
            }
        });
    }

}
