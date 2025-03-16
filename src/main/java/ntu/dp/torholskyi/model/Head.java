package ntu.dp.torholskyi.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Head extends Human{
    public Head(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }
}
