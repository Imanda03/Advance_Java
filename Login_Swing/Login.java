package Login_Swing;

import javax.swing.*;

public class Login {
    public Login() {
        JFrame f = new JFrame("Login");
        JLabel lUser = new JLabel("Username");
        lUser.setBounds(20, 20, 150, 25);
        f.add(lUser);

        JTextField tfUser = new JTextField();
        tfUser.setBounds(180, 20, 150, 25);
        f.add(tfUser);

        JLabel lPassword = new JLabel("Password");
        // lPassword.setText("Password");
        lPassword.setBounds(20, 55, 150, 25);
        f.add(lPassword);

        JTextField tfPassword = new JTextField();
        tfPassword.setBounds(180, 55, 150, 25);
        f.add(tfPassword);

        JButton JSubmit = new JButton();
        JSubmit.setText("Login ");
        JSubmit.setBounds(180, 90, 150, 25);
        f.add(JSubmit);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();

    }
}