package ntu.dp.torholskyi;

import ntu.dp.torholskyi.controller.*;
import ntu.dp.torholskyi.model.*;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        System.out.println(run.createTypicalUniversity());
    }

    public University createTypicalUniversity() {
        Human universityHead = new Head("Michael", "Anderson", "Smith", Sex.MALE);
        Human facultyHead = new Head("Sophia", "Miller", "Johnson", Sex.FEMALE);
        Human departmentHead = new Head("Christopher", "Brown", "Davis", Sex.MALE);
        Human groupHead = new Head("Daniel", "Wilson", "Thomas", Sex.MALE);

        List<Student> students = List.of(
                new Student("James", "Taylor", "Moore", Sex.MALE),
                new Student("Emily", "Harris", "Clark", Sex.FEMALE)
        );

        Group group = new GroupCreator().create("123m-24-1", groupHead, students);

        Department department = new DepartmentCreator().create("Computer Science", departmentHead, List.of(group));

        Faculty faculty = new FacultyCreator().create("Faculty of Engineering", facultyHead, List.of(department));

        return new UniversityCreator().create("NTU Politech university", universityHead, List.of(faculty));
    }
}
