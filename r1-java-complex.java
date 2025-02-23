// This code demonstrates CRUD (Create, Read, Update, Delete) operations using JDBC and MySQL.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseCRUD {
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    /**
     * Insert a new record into the database.
     *
     * @param name The name to insert.
     * @param age  The age to insert.
     */
    public static void insertRecord(String name, int age) {
        String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Example usage
    public static void main(String[] args) {
        insertRecord("John Doe", 30);
    }
}
