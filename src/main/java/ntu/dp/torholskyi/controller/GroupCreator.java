package ntu.dp.torholskyi.controller;

import ntu.dp.torholskyi.model.Human;
import ntu.dp.torholskyi.model.Student;

import java.util.List;

public class GroupCreator extends AbstractCreator<Student>{
    public GroupCreator(String name, Human human, List<Student> children) {
        super(name, human, children);
    }
}
