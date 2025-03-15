package ntu.dp.torholskyi.controller;

import ntu.dp.torholskyi.model.Group;
import ntu.dp.torholskyi.model.Human;

import java.util.List;

public class DepartmentCreator extends AbstractCreator<Group>{

    public DepartmentCreator(String name, Human human, List<Group> children) {
        super(name, human, children);
    }
}
