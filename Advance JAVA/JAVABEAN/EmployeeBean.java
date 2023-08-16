package JAVABEAN;

import java.sql.*;

public class EmployeeBean {
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getEmployeeInformation() {
        String employeeInfo = "";
        String databaseURL = "jdbc:mysql://localhost:3306/advancejava";
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(databaseURL, username, password)) {
            String query = "SELECT name, email, address FROM Employee WHERE email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");

                employeeInfo = "Name: " + name + ", Email: " + email + ", Address: " + address;
            } else {
                employeeInfo = "Employee with email " + email + " not found.";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeInfo;
    }
}

