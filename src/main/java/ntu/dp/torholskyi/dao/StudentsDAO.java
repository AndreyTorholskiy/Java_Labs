package ntu.dp.torholskyi.dao;

import ntu.dp.torholskyi.model.Student;
import ntu.dp.torholskyi.utils.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAO {
    private static final String QUERY_FOR_ALL_STUDENTS = "SELECT * FROM STUDENTS";
    private static final String QUERY_FOR_ALL_STUDENTS_BY_MONTH = "SELECT * FROM STUDENTS WHERE MONTH(birth_date) = ?";

    public List<Student> getStudents() throws SQLException {
        List<Student> students = new ArrayList<>();

        try (Connection connection = new ConnectionManager().open();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(QUERY_FOR_ALL_STUDENTS)) {

            while (resultSet.next()) {
                students.add(new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("middle_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("birth_date"),
                        resultSet.getString("gradebook_number")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }

    public List<Student> getStudentsByMonth(int month) {
        List<Student> students = new ArrayList<>();

        try (Connection connection = new ConnectionManager().open();
             PreparedStatement statement = connection.prepareStatement(QUERY_FOR_ALL_STUDENTS_BY_MONTH)){

            statement.setInt(1, month);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                students.add(new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("middle_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("birth_date"),
                        resultSet.getString("gradebook_number")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}
