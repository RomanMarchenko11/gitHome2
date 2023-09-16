package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CityCreator {
    private void createCity() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String city = "INSERT INTO city (name, district, country_id) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(city)) {
            preparedStatement.setString(1, "Kyiv");
            preparedStatement.setInt(2,10);
            preparedStatement.setInt(3, 1);
//            preparedStatement.executeUpdate();
            preparedStatement.addBatch();
            preparedStatement.setString(1, "Warszawa");
            preparedStatement.setInt(2,18);
            preparedStatement.setInt(3, 2);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        }
    }

    public void initialization() {
        try {
            createCity();
            System.out.println("City created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
