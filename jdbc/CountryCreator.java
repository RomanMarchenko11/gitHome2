package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CountryCreator {
    private void createCountry() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String country = "INSERT INTO country (name, people) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(country)) {
            preparedStatement.setString(1, "UKRAINE");
            preparedStatement.setInt(2, 42);
            preparedStatement.addBatch();
            preparedStatement.setString(1, "POLAND");
            preparedStatement.setInt(2,38);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        }
    }

    public void initialization() {
        try {
            createCountry();
            System.out.println("Country created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
