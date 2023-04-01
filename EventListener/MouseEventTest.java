package EventListener;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class MouseEventTest implements MouseListener {
    JFrame f = new JFrame("Catch me");
    JButton b;

    public MouseEventTest() {
        b = new JButton("Catch me");
        b.setBounds(20, 20, 150, 20);
        b.addMouseListener(this);
        f.add(b);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        Random radi = new Random();
        int x = radi.nextInt(450);
        int y = radi.nextInt(580);
        b.setBounds(x, y, 150, 20);
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    public static void main(String[] args) {
        new MouseEventTest();
    }

}
