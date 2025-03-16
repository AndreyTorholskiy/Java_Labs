package ntu.dp.torholskyi.controller;

import ntu.dp.torholskyi.model.Group;
import ntu.dp.torholskyi.model.Human;
import ntu.dp.torholskyi.model.Student;

import java.util.List;

public class GroupCreator extends AbstractCreator<Student> {
    @Override
    public Group create(String name, Human human, List<Student> children) {
        return new Group(name, human, children); // Повертаємо об'єкт Group
    }
}
