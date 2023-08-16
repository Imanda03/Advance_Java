import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Login implements ActionListener {
    JTextField tfUser, tfPassword;
    JFrame f = new JFrame("Login");

    public Login() {

        JLabel lUser = new JLabel("Username");
        lUser.setBounds(20, 20, 150, 25); // (x,y,width,height)
        f.add(lUser);

        tfUser = new JTextField();
        tfUser.setBounds(180, 20, 150, 25); // (x,y,width,height)
        f.add(tfUser);

        JLabel lPassword = new JLabel();
        lPassword.setText("Password"); // also set text in label
        lPassword.setBounds(20, 55, 150, 25);
        f.add(lPassword);

        tfPassword = new JTextField();
        tfPassword.setBounds(180, 55, 150, 25);
        f.add(tfPassword);

        JButton bLogin = new JButton("Login");
        bLogin.setBounds(180, 90, 150, 25);
        bLogin.addActionListener(this);

        f.add(bLogin);

        f.setSize(500, 500);
        bLogin.addActionListener(this);

        f.add(bLogin);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String user = tfUser.getText();
        String password = tfPassword.getText();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select * from User where username = '" + user + "' and password = '" + password + "'");
            while (rs.next()) {
                if (user.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                    JDialog dialog = new JDialog(f, "Authenticated", true);
                    dialog.setLocationRelativeTo(dialog);
                    dialog.setSize(100, 100);
                    dialog.setVisible(true);
                }
            }

        } catch (Exception err) {
            System.out.println(err);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
