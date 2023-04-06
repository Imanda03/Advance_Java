package Login_Swing;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login implements ActionListener {
    JTextField tfUser, tfPassword;
    JFrame f = new JFrame("Login");

    public Login() {
        JLabel lUser = new JLabel("Username");
        lUser.setBounds(20, 20, 150, 25);
        f.add(lUser);

        tfUser = new JTextField();
        tfUser.setBounds(180, 20, 150, 25);
        f.add(tfUser);

        JLabel lPassword = new JLabel("Password");
        // lPassword.setText("Password");
        lPassword.setBounds(20, 55, 150, 25);
        f.add(lPassword);

        tfPassword = new JTextField();
        tfPassword.setBounds(180, 55, 150, 25);
        f.add(tfPassword);

        JButton login = new JButton();
        login.setText("Login ");
        login.setBounds(180, 90, 150, 25);
        login.addActionListener(this);
        f.add(login);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();

    }

    public void actionPerformed(ActionEvent e) {
        String user = tfUser.getText();
        String password = tfPassword.getText();
        // System.out.println(user + password);
        if (user.equals("admin") && password.equals("admin")) {
            JDialog d = new JDialog(f, "Login Success", true);

            d.setLocationRelativeTo(d);
            d.setSize(200, 100);
            d.setVisible(true);
        }

        try {
            Connection conn = DriverManager.getConnection("http://localhost/phpmyadmin/advanceJava","root","");
            

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
}