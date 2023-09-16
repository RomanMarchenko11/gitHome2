package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    private void initializeDatabase() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        try (Statement statement = connection.createStatement()) {
//        створення таблиці country
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS country (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255) NOT NULL," +
                            "people INT" +
                            ")"
            );

//        створення таблиці city
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS city (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255) NOT NULL," +
                            "district INT NOT NULL," +
                            "country_id INT," +
                            "FOREIGN KEY (country_id) REFERENCES country(id)" +
                            ")"
            );

        }
    }

    public void createDatabase() {
        try {
            initializeDatabase();
            System.out.println("Database and tables created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
