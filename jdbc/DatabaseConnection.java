package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "Fiser2022";
//            підключення без вказівки схеми
            String base_url = "jdbc:mysql://localhost:3306/";
            Connection initialConnection = DriverManager.getConnection(base_url, user, password);
            String dbName = "java_r_dreams";
            try (Statement statement = initialConnection.createStatement()) {
//                створення схеми, якщо вона не існує
                statement.execute("CREATE DATABASE IF NOT EXISTS" + dbName);
            }
            initialConnection.close();
//            підключення з вказівкою схеми
            String url = "jdbc:mysql://localhost:3306/java_r_dreams";
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException exception) {
            System.out.println("Database connection creation failed: " + exception.getMessage());
        }
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        } else if (instance.getConnection().isClosed()) {
            synchronized (DatabaseConnection.class) {
                if (instance == null || instance.getConnection().isClosed()) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
