import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonColorExample {
    
    private static final Color INITIAL_COLOR = Color.RED;
    private static final Color UPDATED_COLOR = Color.GREEN;
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Button Color Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel(new FlowLayout());
            JButton button = new JButton("Click Me!");
            
            button.setBackground(INITIAL_COLOR);
            
            
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.setBackground(UPDATED_COLOR);
                }
            });
           
            panel.add(button);
            
            frame.getContentPane().add(panel);
            
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
