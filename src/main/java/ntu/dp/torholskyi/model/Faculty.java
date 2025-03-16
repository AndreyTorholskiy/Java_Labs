package ntu.dp.torholskyi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Faculty extends StructuralUnit<Department> {
    public Faculty(String name, Human human, List<Department> children) {
        super(name, human, children);
    }

    @Override
    public String toString() {
        return "Faculty: " + getName() + ", Head: " + getHuman() + ", Departments: " + getChildren();
    }
}
