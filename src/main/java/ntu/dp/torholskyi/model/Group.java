package ntu.dp.torholskyi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Group extends StructuralUnit<Student> {
    public Group(String name, Human human, List<Student> children) {
        super(name, human, children);
    }

    public void addStudent(Student student) {
        getChildren().add(student);
    }

    @Override
    public String toString() {
        return "Group: " + getName() + ", Students: " + getChildren();
    }
}
