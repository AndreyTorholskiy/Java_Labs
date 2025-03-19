package ntu.dp.torholskyi.model;

import lombok.Data;

@Data
public abstract class Human {
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthDate;

    public Human(long id, String firstName, String middleName, String lastName, String birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
