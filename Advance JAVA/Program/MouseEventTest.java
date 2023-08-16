import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class MouseEventTest implements MouseListener {
    JFrame f = new JFrame("Catch me test");
    JButton b;

    public MouseEventTest() {
        b = new JButton("NA XU MALAI");
        b.setBounds(20, 20, 150, 20);
        f.add(b);
        b.addMouseListener(this);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Random r = new Random();
        int x = r.nextInt(450);
        int y = r.nextInt(580);

        b.setBounds(x, y, 150, 20);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        new MouseEventTest();
    }

}
