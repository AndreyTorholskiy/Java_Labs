package ntu.dp.torholskyi.model;

import java.util.List;

public class Group extends StructuralUnit<Group> {
    public Group(String name, Human human, List<Group> children) {
        super(name, human, children);
    }
}
