package ntu.dp.torholskyi.model;

import com.google.gson.*;
import java.lang.reflect.Type;

public class HumanAdapter implements JsonDeserializer<Human> {
    @Override
    public Human deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();

        if (jsonObject.has("type") && "Head".equals(jsonObject.get("type").getAsString())) {
            return context.deserialize(jsonObject, Head.class);
        }

        return context.deserialize(jsonObject, Human.class);
    }
}
