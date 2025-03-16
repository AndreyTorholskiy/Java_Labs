package ntu.dp.torholskyi;

import ntu.dp.torholskyi.controller.*;
import ntu.dp.torholskyi.model.*;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.createTypicalUniversity();
    }

    public void createTypicalUniversity() {
        // Створення керівників
        Human universityHead = new Head("Іван", "Іванов", "Іванович", Sex.MALE);
        Human facultyHead = new Head("HH", "Іванов", "Іванович", Sex.MALE);
        Human departmentHead = new Head("ee", "Іванов", "Іванович", Sex.MALE);
        Human groupHead = new Head("FF", "Іванов", "Іванович", Sex.MALE);

        // Створення студентів
        Student student1 = new Student("Олександр", "Петренко", "Володимирович", Sex.MALE);
        Student student2 = new Student("Марія", "Коваленко", "Олексіївна", Sex.FEMALE);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        // Створення групи
        GroupCreator groupCreator = new GroupCreator();
        Group group = groupCreator.create("Група 1", groupHead, students);

        List<Group> groups = new ArrayList<>();
        groups.add(group);

        // Створення кафедри
        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department department = departmentCreator.create("Кафедра інформатики", departmentHead, groups);

        List<Department> departments = new ArrayList<>();
        departments.add(department);

        // Створення факультету
        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty = facultyCreator.create("Факультет комп'ютерних наук", facultyHead, departments);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);

        // Створення університету
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.create("Університет IT", universityHead, faculties);

        System.out.println(university);
    }
}
