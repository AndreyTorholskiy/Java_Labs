package ntu.dp.torholskyi.controller;

import ntu.dp.torholskyi.model.Department;
import ntu.dp.torholskyi.model.Human;
import ntu.dp.torholskyi.model.Group;

import java.util.List;

public class DepartmentCreator extends AbstractCreator<Group> {
    @Override
    public Department create(String name, Human human, List<Group> children) {
        return new Department(name, human, children); // Повертаємо об'єкт Department
    }
}
