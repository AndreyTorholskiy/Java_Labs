package ntu.dp.torholskyi.model;

import lombok.Data;

import java.util.List;

@Data
public class Department extends StructuralUnit<Group>{
    public Department(String name, Human human, List<Group> children) {
        super(name, human, children);
    }

    public void addDepartment(Group group) {
        super.getChildren().add(group);
    }

    @Override
    public String toString() {
        return "Department: " + super.getName() + ", " + super.getChildren().get(0).getName() + ", " + super.getChildren().get(1).getName();
    }
}
