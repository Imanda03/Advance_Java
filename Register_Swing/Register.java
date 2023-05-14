package Register_Swing;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Register implements ActionListener {
    JTextField tfusername;
    JPasswordField tfPassword;
    JFrame f;
    JButton JSubmit;

    public Register() {
        f = new JFrame("Register");
        JLabel Password = new JLabel("Username");
        Password.setBounds(20, 90, 150, 25);
        f.add(Password);

        tfusername = new JTextField();
        tfusername.setBounds(180, 90, 150, 25);
        f.add(tfusername);

        JLabel jRePassword = new JLabel("Password");
        jRePassword.setBounds(20, 125, 150, 25);
        f.add(jRePassword);

        tfPassword = new JPasswordField();
        tfPassword.setBounds(180, 125, 150, 25);
        f.add(tfPassword);

        JSubmit = new JButton();
        JSubmit.setText("Register");
        JSubmit.setBounds(180, 160, 150, 25);
        JSubmit.addActionListener(this);
        f.add(JSubmit);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = tfusername.getText();
        String password = tfPassword.getText();

        String dburl = "jdbc:mysql://localhost/login?useSSL=false";
        String dbUsername = "root";
        String dbPassword = "root";

        try (Connection conn = DriverManager.getConnection(dburl, dbUsername, dbPassword)) {
            String query = "INSERT INTO login(`username`, `password`) VALUES ('" + username + "', '" + password + "')";
            Statement stmt = conn.prepareStatement(query);
            int affectedRows = stmt.executeUpdate(query);
            if (affectedRows > 0) {
                JDialog dialog = new JDialog(f, "User Creaton Success", true);
                dialog.setLocationRelativeTo(dialog);
                dialog.setSize(400, 100);
                dialog.setVisible(true);
            }
        } catch (Exception se) {
            se.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Register();

    }
}
