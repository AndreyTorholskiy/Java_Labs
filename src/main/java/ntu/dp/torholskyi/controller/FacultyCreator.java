package ntu.dp.torholskyi.controller;

import ntu.dp.torholskyi.model.Faculty;
import ntu.dp.torholskyi.model.Human;
import ntu.dp.torholskyi.model.Department;

import java.util.List;

public class FacultyCreator extends AbstractCreator<Department> {
    @Override
    public Faculty create(String name, Human human, List<Department> children) {
        return new Faculty(name, human, children); // Повертаємо об'єкт Faculty
    }
}
