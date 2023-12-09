package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/classes";
        String username = "root";
        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            String insertQuery = "INSERT INTO lab3_classes (class_name) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, "Person");
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
