import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class Register implements ActionListener {

  JTextField tfUsername, tfPassword;
  JFrame f = new JFrame("Register");

  public Register() {
    JFrame f = new JFrame("Register");

    JLabel lUsername = new JLabel();
    lUsername.setText("Username"); // also set text in label
    lUsername.setBounds(20, 55, 150, 25);
    f.add(lUsername);

    tfUsername = new JTextField();
    tfUsername.setBounds(180, 55, 150, 25);
    f.add(tfUsername);

    JLabel lPassword = new JLabel();
    lPassword.setText("Password");
    lPassword.setBounds(20, 90, 150, 25);
    f.add(lPassword);

    tfPassword = new JTextField();
    tfPassword.setBounds(180, 90, 150, 25);
    f.add(tfPassword);

    JButton register = new JButton("Register");
    register.setBounds(180, 160, 150, 25);

    f.add(register);
    register.addActionListener(this);

    f.setSize(500, 500);
    f.setLayout(null);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String user = tfUsername.getText();
    String password = tfPassword.getText();
    try {
      Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/advancejava",
        "root",
        ""
      );
      Statement stmt = conn.createStatement();
      int rs = stmt.executeUpdate(
        "insert into User (username, password) values('" +
        user +
        "','" +
        password +
        "')"
      );

      JDialog dialog = new JDialog(f, "User succesfully registed", true);
      dialog.setLocationRelativeTo(dialog);
      dialog.setSize(100, 100);
      dialog.setVisible(true);

      tfUsername.setText("");
      tfPassword.setText("");
    } catch (Exception err) {
      System.out.println(err);
    }
  }

  public static void main(String[] args) {
    new Register();
  }
}
