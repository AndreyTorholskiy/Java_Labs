package ntu.dp.torholskyi.controller;

import ntu.dp.torholskyi.model.Department;
import ntu.dp.torholskyi.model.Human;

import java.util.List;

public class FacultyCreator extends AbstractCreator<Department> {

    public FacultyCreator(String name, Human human, List<Department> children) {
        super(name, human, children);
    }
}
