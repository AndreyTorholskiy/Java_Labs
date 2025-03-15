package ntu.dp.torholskyi.controller;

import ntu.dp.torholskyi.model.Human;
import ntu.dp.torholskyi.model.StructuralUnit;

import java.util.List;

public abstract class AbstractCreator<T> extends StructuralUnit<T> {

    public AbstractCreator(String name, Human human, List<T> children) {
        super(name, human, children);
    }
}
