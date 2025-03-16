package ntu.dp.torholskyi.model;

import com.google.gson.annotations.SerializedName;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Head extends Human{
    public Head(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }

    @SerializedName("type")
    private String type = "Head"; // You can mark the type for differentiation in JSON.
}
