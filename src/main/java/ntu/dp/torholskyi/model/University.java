package ntu.dp.torholskyi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class University extends StructuralUnit<Faculty> {
    public University(String name, Human human, List<Faculty> children) {
        super(name, human, children);
    }

    public void addFaculty(Faculty faculty) {
        getChildren().add(faculty);
    }

    @Override
    public String toString() {
        return "University: " + getName() + ", Faculties: " + getChildren();
    }
}
