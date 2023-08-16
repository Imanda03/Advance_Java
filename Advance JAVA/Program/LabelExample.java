import javax.swing.*;
import java.awt.*;

public class LabelExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the main frame
            JFrame frame = new JFrame("Label Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a panel with BorderLayout
            JPanel panel = new JPanel(new BorderLayout());

            // Create a label with custom text, style, size, and color
            JLabel label = new JLabel("<html><i>Hello, world!</i></html>");
            label.setFont(new Font(Font.SERIF, Font.ITALIC, 20));
            label.setForeground(Color.BLUE);

            // Add the label to the center of the panel
            panel.add(label, BorderLayout.CENTER);

            // Add the panel to the frame
            frame.getContentPane().add(panel);

            // Pack and display the frame
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
