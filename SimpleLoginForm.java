import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class SimpleLoginForm extends JFrame{
    
    private Container c;
    private JButton cleanButton, loginButton;
    private Cursor cursor;
    private ImageIcon img1, img2;
    private JLabel username, pass;
    private JTextField nameTxt;
    private JPasswordField passTxt;
    private Font f;

    SimpleLoginForm(){
        initComponents();
    }
    public void initComponents(){

        this.setTitle("Simple Login Form");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);

        cursor = new Cursor(Cursor.HAND_CURSOR);// For Cursor setting

        f = new Font("Arial", Font.BOLD, 18);

        img1 = new ImageIcon(getClass().getResource("login.png"));
        img2 = new ImageIcon(getClass().getResource("clear.png"));
        
        username = new JLabel("Username: ");
        username.setBounds(40, 30, 120, 40);
        username.setFont(f);
        username.setForeground(Color.ORANGE);
        c.add(username);
        nameTxt = new JTextField();
        nameTxt.setBounds(160, 30, 190, 40);
        nameTxt.setFont(f);
        c.add(nameTxt);

        pass = new JLabel("Password: ");
        pass.setBounds(40, 90, 120, 40);
        pass.setFont(f);
        pass.setForeground(Color.ORANGE);
        c.add(pass);
        passTxt = new JPasswordField();
        passTxt.setBounds(160, 90, 190, 40);
        passTxt.setFont(f);
        c.add(passTxt);

        loginButton = new JButton(img1);
        loginButton.setBounds(95, 155, 100, 50);
        loginButton.setCursor(cursor);// Cursor setup
        c.add(loginButton);

        cleanButton = new JButton(img2);
        cleanButton.setBounds(210, 155, 100, 50);
        cleanButton.setCursor(cursor);// Cursor setup
        c.add(cleanButton);

        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String userName = nameTxt.getText();
                String password = passTxt.getText();
                if(userName.equals("") || password.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter Username And Password.");
                    nameTxt.setText("");
                    passTxt.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Welcome "+userName);
                    dispose();
                    AfterLoginPage frame = new AfterLoginPage();
                    frame.setVisible(true);
                }
            }
        });

        cleanButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                nameTxt.setText("");
                passTxt.setText("");
            }
        });
    }

    public static void main(String[] args){
        SimpleLoginForm frame = new SimpleLoginForm();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
    }
}