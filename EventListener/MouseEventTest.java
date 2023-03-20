package EventListener;

import javax.swing.*;
import java.awt.event.*;

public class MouseEventTest implements MouseListener {

    public MouseEventTest() {
        JFrame f = new JFrame("Catch me");
        JButton b = new JButton("Catch me");
        b.setBounds(20, 20, 150, 20);
        f.add(b);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

}
