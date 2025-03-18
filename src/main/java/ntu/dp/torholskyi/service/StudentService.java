package ntu.dp.torholskyi.service;

import ntu.dp.torholskyi.dao.StudentsDAO;
import ntu.dp.torholskyi.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private StudentsDAO studentsDAO = new StudentsDAO();

    public List<Student> filterStudentsByMonth(List<Student> students, int month) {
        return students.stream()
                .filter(s -> Integer.parseInt(s.getBirthDate().split("-")[1]) == month)
                .collect(Collectors.toList());
    }
}
