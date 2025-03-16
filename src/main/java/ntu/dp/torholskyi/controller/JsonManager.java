package ntu.dp.torholskyi.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ntu.dp.torholskyi.model.Human;
import ntu.dp.torholskyi.model.University;
import ntu.dp.torholskyi.model.HumanAdapter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    public void saveUniversityToJson(University university, String filePath) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Human.class, new HumanAdapter()) // Register the adapter here
                .create();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public University loadUniversityFromJson(String filePath) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Human.class, new HumanAdapter()) // Register the adapter here
                .create();
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
