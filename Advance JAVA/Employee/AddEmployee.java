
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddEmployee implements ActionListener {
  JTextField tfEmployeename, tfEmail, tfAddress;
  JFrame f = new JFrame("Add Employee");

  public AddEmployee() {
    JFrame f = new JFrame("Add Employee");

    JLabel lEmployeeName = new JLabel();
    lEmployeeName.setText("Employee Name"); // also set text in label
    lEmployeeName.setBounds(20, 55, 150, 25);
    f.add(lEmployeeName);

    tfEmployeename = new JTextField();
    tfEmployeename.setBounds(180, 55, 150, 25);
    f.add(tfEmployeename);

    JLabel lEmail = new JLabel();
    lEmail.setText("Email");
    lEmail.setBounds(20, 90, 150, 25);
    f.add(lEmail);

    tfEmail = new JTextField();
    tfEmail.setBounds(180, 90, 150, 25);
    f.add(tfEmail);

    JLabel lAddress = new JLabel();
    lAddress.setText("Address");
    lAddress.setBounds(20, 125, 150, 25);
    f.add(lAddress);

    tfAddress = new JTextField();
    tfAddress.setBounds(180, 125, 150, 25);
    f.add(tfAddress);

    JButton register = new JButton("Add Employee");
    register.setBounds(180, 160, 150, 25);

    f.add(register);
    register.addActionListener(this);

    f.setSize(500, 500);
    f.setLayout(null);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String name = tfEmployeename.getText();
    String email = tfEmail.getText();
    String address = tfAddress.getText();
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection(
          "jdbc:mysql://localhost/login?useSSL=false",
          "root",
          "root");
      Statement stmt = conn.createStatement();
      int rs = stmt.executeUpdate(
          "insert into Employee (name, email, address) values('" +
              name +
              "','" +
              email +
              "','" +
              address +
              "')");

      JDialog dialog = new JDialog(f, "Employee succesfully added", true);
      dialog.setLocationRelativeTo(dialog);
      dialog.setSize(100, 100);
      dialog.setVisible(true);

      tfEmployeename.setText("");
      tfEmail.setText("");
      tfAddress.setText("");
    } catch (Exception err) {
      System.out.println(err);
    }
  }

  public static void main(String[] args) {
    new AddEmployee();
  }
}
