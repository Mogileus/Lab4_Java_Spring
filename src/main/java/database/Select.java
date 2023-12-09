package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/classes";
        String username = "root";
        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            String selectQuery = "SELECT * FROM lab3_classes";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String class_name = resultSet.getString("class_name");
                System.out.println("ID: " + id + ", Class name: " + class_name);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

