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

    @Override
    public String toString() {
        return "University: " + getName() + ", Head: " + getHuman() + ", Faculties: " + getChildren();
    }
}
