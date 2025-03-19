package ntu.dp.torholskyi.model;

import java.sql.Date;

public class Student extends Human {
    private String gradeBookNumber;

    public Student(long id, String firstName, String middleName, String lastName, String birthDate, String gradeBookNumber) {
        super(id, firstName, middleName, lastName, birthDate);
        this.gradeBookNumber = gradeBookNumber;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", grade book: %s", gradeBookNumber);
    }
}
