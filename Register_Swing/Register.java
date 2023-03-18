package Register_Swing;

import javax.swing.*;

public class Register {
    public Register() {
        JFrame f = new JFrame("Register");
        JLabel lName = new JLabel("Full Name");
        lName.setBounds(20, 20, 150, 25);
        f.add(lName);

        JTextField tfName = new JTextField();
        tfName.setBounds(180, 20, 150, 25);
        f.add(tfName);

        JLabel lUsername = new JLabel("UserName");
        // lUsername.setText("Password");
        lUsername.setBounds(20, 55, 150, 25);
        f.add(lUsername);

        JTextField tfUsername = new JTextField();
        tfUsername.setBounds(180, 55, 150, 25);
        f.add(tfUsername);

        JLabel Password = new JLabel("Password");
        Password.setBounds(20, 90, 150, 25);
        f.add(Password);

        JTextField tfPassword = new JTextField();
        tfPassword.setBounds(180, 90, 150, 25);
        f.add(tfPassword);

        JLabel jRePassword = new JLabel("RePassword");
        jRePassword.setBounds(20, 125, 150, 25);
        f.add(jRePassword);

        JTextField tfRePassword = new JTextField();
        tfRePassword.setBounds(180, 125, 150, 25);
        f.add(tfRePassword);

        JButton JSubmit = new JButton();
        JSubmit.setText("Register");
        JSubmit.setBounds(180, 160, 150, 25);
        f.add(JSubmit);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Register();

    }
}
