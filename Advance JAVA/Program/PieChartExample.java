import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PieChartExample extends JPanel {

    private double[] data;

    public PieChartExample(double[] data) {
        this.data = data;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();
        int minDimension = Math.min(width, height);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        g2d.setStroke(new BasicStroke(2.0f));

        double total = 0;
        for (double value : data) {
            total += value;
        }

        double startAngle = 0;
        for (int i = 0; i < data.length; i++) {
            double arcAngle = 360 * (data[i] / total);
            g2d.setColor(getColor(i));
            g2d.fill(new Arc2D.Double(width / 2 - minDimension / 4, height / 2 - minDimension / 4,
                    minDimension / 2, minDimension / 2, startAngle, arcAngle, Arc2D.PIE));
            startAngle += arcAngle;
        }
    }

    private Color getColor(int index) {
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.MAGENTA};
        return colors[index % colors.length];
    }

    public static void main(String[] args) {
        double[] data = {30, 20, 10, 15, 25};
        PieChartExample pieChart = new PieChartExample(data);

        JFrame frame = new JFrame("Pie Chart Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pieChart);
        frame.setSize(new Dimension(400, 400));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
