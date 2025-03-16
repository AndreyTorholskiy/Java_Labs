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
        Human rector = new Head("Іван", "Іванов", "Іванович", Sex.MALE);

        Student student1 = new Student("Олександр", "Петренко", "Володимирович", Sex.MALE);
        Student student2 = new Student("Марія", "Коваленко", "Олексіївна", Sex.FEMALE);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        GroupCreator groupCreator = new GroupCreator();
        Group group = groupCreator.create("Група 1", rector, students);

        List<Group> groups = new ArrayList<>();
        groups.add(group);
        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department department = departmentCreator.create("Кафедра інформатики", rector, groups);

        List<Department> departments = new ArrayList<>();
        departments.add(department);
        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty = facultyCreator.create("Факультет комп'ютерних наук", rector, departments);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);
        UniversityCreator universityCreator = new UniversityCreator("Університет IT", rector, faculties);
        University university = universityCreator.create("Університет IT", rector, faculties);

        System.out.println(university);
    }
}
