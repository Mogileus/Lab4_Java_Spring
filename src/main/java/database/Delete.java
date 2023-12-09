package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/classes";
        String username = "root";
        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            String deleteQuery = "DELETE FROM lab3_classes WHERE class_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1, "Magazine");
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
