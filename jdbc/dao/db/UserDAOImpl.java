package jdbc.dao.db;

import jdbc.dao.constants.Queries;
import jdbc.dao.entity.Department;
import jdbc.dao.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private final Connection connection;
    public UserDAOImpl () throws SQLException {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }
    @Override
    public User findByID(Integer id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.USER_FIND_BY_ID.getName())){
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Department department = new Department();
                department.setID(resultSet.getInt("department_id"));
                department.setName(resultSet.getString("department_name"));

                User user = new User();
                user.setID(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setDepartment(department);
                return user;
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public User update(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.USER_UPDATE.getName())) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setInt(3, user.getDepartment().getID());
            preparedStatement.setInt(4, user.getID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public User save(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.USER_INSERT.getName())) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setInt(3, user.getDepartment().getID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public User delete(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.USER_DELETE.getName())){
            preparedStatement.setInt(1, user.getID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(Queries.USER_FIND_ALL.getName())){
            Department department = new Department();
            department.setID(resultSet.getInt("department_id"));
            department.setName(resultSet.getString("department_name"));

            User user = new User();
            user.setID(resultSet.getInt("user_id"));
            user.setName(resultSet.getString("user_name"));
            user.setSurname(resultSet.getString("surname"));
            user.setDepartment(department);

            users.add(user);
        } catch (SQLException e) {
         throw new RuntimeException();
        }
        return null;
    }
}
