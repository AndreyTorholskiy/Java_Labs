package ntu.dp.torholskyi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + patronymic + " (" + sex + ")";
    }
}
