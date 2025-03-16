package ntu.dp.torholskyi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public abstract class StructuralUnit<T> {
    private String name;
    private Human human;
    private List<T> children;

    public StructuralUnit(String name, Human human, List<T> children) {
        this.name = name;
        this.human = human;
        this.children = new ArrayList<>(children);
    }
}
