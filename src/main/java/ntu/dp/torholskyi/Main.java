package ntu.dp.torholskyi;

import ntu.dp.torholskyi.dao.StudentsDAO;
import ntu.dp.torholskyi.model.Student;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        StudentsDAO studentsDAO = new StudentsDAO();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month to do the search (1-12): ");
        int month = scanner.nextInt();

        System.out.println("\nDB menu options!\n");
        System.out.println("1. Show all students from db");
        System.out.println("2. Show all students from db by month");
        int option = scanner.nextInt();

        List<Student> students = List.of();

        students = switch (option) {
            case 1 -> studentsDAO.getStudents();
            case 2 -> studentsDAO.getStudentsByMonth(month);
            default -> students;
        };

        if (students.isEmpty()) {
            System.out.println("No students born in month " + month);
        } else {
            System.out.println("List of students born in month "+month+":");
            students.forEach(System.out::println);
        }
    }
}