package ntu.dp.torholskyi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Department extends StructuralUnit<Group> {
    public Department(String name, Human human, List<Group> children) {
        super(name, human, children);
    }

    @Override
    public String toString() {
        return "Department: " + getName() + ", Head: " + getHuman() + ", Groups: " + getChildren();
    }
}
