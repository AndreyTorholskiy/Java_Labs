package ntu.dp.torholskyi.controller;

import ntu.dp.torholskyi.model.Human;
import ntu.dp.torholskyi.model.Sex;

public class StudentCreator extends Human {
    public StudentCreator(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }
}
