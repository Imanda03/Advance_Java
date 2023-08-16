import java.awt.event.*;
import javax.swing.*;

public class StudentRegister implements ActionListener{
    JTextField tfFirstName, tfLastName;
  JFrame f = new JFrame("Register");

  public StudentRegister() {
    JFrame f = new JFrame("Register");

    JLabel lFirstName = new JLabel();
    lFirstName.setText("First Name"); // also set text in label
    lFirstName.setBounds(20, 55, 150, 25);
    f.add(lFirstName);

    tfFirstName = new JTextField();
    tfFirstName.setBounds(180, 55, 150, 25);
    f.add(tfFirstName);

    JLabel lLastName = new JLabel();
    lLastName.setText("Last Name");
    lLastName.setBounds(20, 90, 150, 25);
    f.add(lLastName);

    tfLastName = new JTextField();
    tfLastName.setBounds(180, 90, 150, 25);
    f.add(tfLastName);

    JButton register = new JButton("Register");
    register.setBounds(180, 160, 150, 25);

    f.add(register);
    register.addActionListener(this);

    f.setSize(500, 500);
    f.setLayout(null);
    f.setVisible(true);
  }


public static void main(String[] args) {
    new StudentRegister();
  }


@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}
}
