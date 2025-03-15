package ntu.dp.torholskyi.model;

import lombok.Data;
import java.util.List;

@Data
public class University extends StructuralUnit<Faculty> {
    public University(String name, Human human, List<Faculty> children) {
        super(name, human, children);
    }

    public void addFaculty(Faculty faculty) {
        super.getChildren().add(faculty);
    }

    @Override
    public String toString() {
        return "University: " + super.getName() + ", " + super.getChildren().toString() + ", " + super.getChildren().toString();
    }
}
