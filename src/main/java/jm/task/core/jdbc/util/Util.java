package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/db";
    private static final String USER = "AAAA";
    private static final String PASSWORD = "impish donator versus uncouple bath subside";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver was not loaded. " + e.getMessage());
        }

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            connection = conn;
        } catch (SQLException e) {
            System.out.println("Connection failed. " + e.getMessage());
        }
        return connection;
    }
}
