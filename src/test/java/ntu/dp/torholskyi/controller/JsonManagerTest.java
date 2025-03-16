package ntu.dp.torholskyi.controller;

import ntu.dp.torholskyi.Run;
import ntu.dp.torholskyi.model.University;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class JsonManagerTest {

    private static final String FILE_PATH = "test_university.json";

    @Test
    void saveUniversityToJson() {
        JsonManager jsonManager = new JsonManager();
        Run run = new Run();
        University university = run.createTypicalUniversity();

        jsonManager.saveUniversityToJson(university, FILE_PATH);

        File file = new File(FILE_PATH);
        assertTrue(file.exists(), "File should be created");

        try {
            String fileContent = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
            assertFalse(fileContent.isEmpty(), "File should not be empty");
        } catch (IOException e) {
            fail("Failed to read file: " + e.getMessage());
        }
    }

    @Test
    void loadUniversityFromJson() {
        JsonManager jsonManager = new JsonManager();
        Run run = new Run();
        University originalUniversity = run.createTypicalUniversity();

        jsonManager.saveUniversityToJson(originalUniversity, FILE_PATH);

        University loadedUniversity = jsonManager.loadUniversityFromJson(FILE_PATH);

        assertNotNull(loadedUniversity, "Loaded university should not be null");
        assertEquals(originalUniversity, loadedUniversity, "Loaded university should be equal to the original");

    }
}