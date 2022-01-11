import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AfterLoginPage extends JFrame {

    private Container c;
    private JButton btn;

    AfterLoginPage(){
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        btn = new JButton("Exit");
        btn.setBounds(140, 100, 100, 50);
        c.add(btn);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        AfterLoginPage fr = new AfterLoginPage();
        fr.setVisible(true);
    }
}
