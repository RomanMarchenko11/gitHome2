package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
1. Встановити Mysql та створити 2 таблиці: місто та країна. Додаткові поля підібрати самостійно.
Зробити між ними зв'язок один до багатьох. Заповнити ці таблиці кількома записами.
2. Створити клас студент і за допомогою Java зберігати інформацію про студента в базі даних та прочитати її.
 */
public class LessonThirtyTwo {
    public static void main(String[] args) throws SQLException {
        System.out.println("Home Task 1");
        DatabaseCreationFacade databaseCreationFacade = new DatabaseCreationFacade();
        databaseCreationFacade.createAndInsertDatabase(false); // to create - change value false -> true

        System.out.println("Home Task 2");
        createStudentsDatabase();
        addStudentDatabase(new Studentu("Anton", "Strelkov", 25, "1A"));
        addStudentDatabase(new Studentu("Artur", "Menshov", 24, "1A"));
        addStudentDatabase(new Studentu("Klim", "Staruy", 26, "1B"));
        addStudentDatabase(new Studentu("Grigoriy", "Grek", 24, "1B"));
        List<Studentu> studentList = readDatabaseStudents();
        for (Studentu studentu: studentList) {
            System.out.println(studentu);
        }

    }

    public static List<Studentu> readDatabaseStudents() throws SQLException {
        List<Studentu> students = new ArrayList<>();
        String sql = "SELECT s.id, s.surname, s.name, s.age, s.groupID " +
                "FROM students s";
        Connection connection = DatabaseConnection.getInstance().getConnection();
        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Studentu studentu = new Studentu();
                studentu.setName(resultSet.getString("name"));
                studentu.setSurname(resultSet.getString("surname"));
                studentu.setAge(resultSet.getInt("age"));
                studentu.setGroupID(resultSet.getString("groupID"));

                students.add(studentu);
            }
        }
        return students;
    }

    public static void addStudentDatabase(Studentu student) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String studentu = "INSERT INTO students (name, surname, age, groupID) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(studentu)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3,student.getAge());
            preparedStatement.setString(4, student.getGroupID());
            preparedStatement.executeUpdate();
        }
    }
    public static void createStudentsDatabase() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS students (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(100) NOT NULL," +
                            "surname VARCHAR(100) NOT NULL," +
                            "age INT NOT NULL," +
                            "groupID VARCHAR(100) NOT NULL" +
                            ")"
            );
        }
    }
}
