package ntu.dp.torholskyi.controller;

import ntu.dp.torholskyi.model.Faculty;
import ntu.dp.torholskyi.model.Human;

import java.util.List;

public class UniversityCreator extends AbstractCreator<Faculty> {
    public UniversityCreator(String name, Human human, List<Faculty> children) {
        super(name, human, children);
    }
}
