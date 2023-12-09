package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/classes";
        String username = "root";
        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            String updateQuery = "UPDATE lab3_classes SET id = ? WHERE class_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Book");
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}