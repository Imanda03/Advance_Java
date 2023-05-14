package Login_Swing;

import javax.swing.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Login implements ActionListener {
    JTextField tfUser;
    JPasswordField tfPassword;
    JFrame f = new JFrame("Login");
    JButton login;

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

        tfPassword = new JPasswordField();
        tfPassword.setBounds(180, 55, 150, 25);
        f.add(tfPassword);

        login = new JButton();
        login.setText("Login ");
        login.setBounds(180, 90, 150, 25);
        login.addActionListener(this);
        f.add(login);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = tfUser.getText();
        String password = tfPassword.getText();

        String dburl = "jdbc:mysql://localhost/login?useSSL=false";
        String dbUsername = "root";
        String dbPassword = "root";

        try (Connection conn = DriverManager.getConnection(dburl, dbUsername, dbPassword)) {
            String query = "SELECT * FROM login WHERE username='" + username + "' AND password='" + password + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                    JDialog dialog = new JDialog(f, "Authenticated", true);
                    dialog.setLocationRelativeTo(dialog);
                    dialog.setSize(400, 100);
                    dialog.setVisible(false);
                }
            }

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();

    }

}