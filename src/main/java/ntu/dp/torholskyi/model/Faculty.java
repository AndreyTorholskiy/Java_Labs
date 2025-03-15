package ntu.dp.torholskyi.model;

import lombok.Data;

import java.util.List;

@Data
public class Faculty extends StructuralUnit<Department>{
    public Faculty(String name, Human human, List<Department> children) {
        super(name, human, children);
    }

    public void addDepartment(Department department) {
        super.getChildren().add(department);
    }

    @Override
    public String toString() {
        return "Faculty: " + super.getName() + ", " + super.getChildren().get(0).getName() + ", " + super.getChildren().get(1).getName();
    }
}
