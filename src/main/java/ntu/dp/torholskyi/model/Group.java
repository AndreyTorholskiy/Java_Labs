package ntu.dp.torholskyi.model;

import lombok.Data;
import java.util.List;

@Data
public class Group extends StructuralUnit<Student> {
    public Group(String name, Human human, List<Student> children) {
        super(name, human, children);
    }

    public void addStudent(Student student) {
        super.getChildren().add(student);
    }

    @Override
    public String toString() {
        return "Group: " + super.getName() + ", " + super.getChildren().toString() + ", " + super.getChildren().toString();
    }
}
