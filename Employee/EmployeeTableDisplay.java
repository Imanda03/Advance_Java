package Employee;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class EmployeeTableDisplay extends JFrame {

    private JTable table;
    private JScrollPane scrollPane;

    public EmployeeTableDisplay() {
        setTitle("Employee Information Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        String[] columnNames = {"Name", "Email", "Address"};
        String[][] data = fetchEmployeeDataFromDatabase();

        table = new JTable(data, columnNames);
        table.setEnabled(false); 

        scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    private String[][] fetchEmployeeDataFromDatabase() {
        String[][] data = null;

        String databaseURL = "jdbc:mysql://localhost:3306/advancejava"; 
        String username = "root"; 
        String password = ""; 
        String tableName = "Employee";

        try (Connection connection = DriverManager.getConnection(databaseURL, username, password)) {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            String query = "SELECT name, email, address FROM " + tableName;
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.last();
            int numRows = resultSet.getRow();
            resultSet.beforeFirst();

            data = new String[numRows][3];

            int row = 0;
            while (resultSet.next()) {
                data[row][0] = resultSet.getString("name");
                data[row][1] = resultSet.getString("email");
                data[row][2] = resultSet.getString("address");
                row++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeTableDisplay employeeTable = new EmployeeTableDisplay();
            employeeTable.setVisible(true);
        });
    }
}
