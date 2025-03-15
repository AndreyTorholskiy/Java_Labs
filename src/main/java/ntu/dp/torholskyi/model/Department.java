package ntu.dp.torholskyi.model;

import java.util.List;

public class Department extends StructuralUnit<Group>{
    public Department(String name, Human human, List<Group> children) {
        super(name, human, children);
    }

    @Override
    public String toString() {
        return "Department: " + super.getName() + ", " + super.getChildren().get(0).getName() + ", " + super.getChildren().get(1).getName();
    }
}
