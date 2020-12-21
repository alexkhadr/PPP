package persistence;

/*
import exception.DuplicateException;
import model.Application;
import model.Internship;
import model.Student;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;


public class JsonReader {
    private String source;
    ArrayList<Internship> internships = new ArrayList<Internship>();


    // EFFECTS: constructs reader to read from source file
    public JsonReader(String source) {
        this.source = source;
    }

    // EFFECTS: reads portfolio from file and returns it;
    // throws IOException if an error occurs reading data from file
    public Application read() throws IOException, DuplicateException {
        String jsonData = readFile(source);
        JSONObject jsonObject = new JSONObject(jsonData);
        return parseMyPortfolio(jsonObject);
    }

    // EFFECTS: reads source file as string and returns it
    private String readFile(String source) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(source), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s));
        }

        return contentBuilder.toString();
    }

    // EFFECTS: parses myPortfolio from JSON object and returns it
    public Application parseMyPortfolio(JSONObject jsonObject) throws IOException, DuplicateException {
        String name = jsonObject.getString("name");
        double balance = jsonObject.getDouble("balance");
        Application a = new Application();
        //Internship i = new Internship();
        addMultipleInternships(a, jsonObject);
        return a;
    }

    // MODIFIES: mp
    // EFFECTS: parses addMultipleBonds from JSON object and adds them to MyPortfolio
    private void addMultipleInternships(Application a, JSONObject jsonObject) throws DuplicateException {
        JSONArray jsonArray = jsonObject.getJSONArray("thingies");
        for (Object json : jsonArray) {
            JSONObject nextInternship = (JSONObject) json;
            addInternshipToList(a, nextInternship);
        }
    }

    // MODIFIES: a
    // EFFECTS: parses addBondToList from JSON object and adds it to MyPortfolio
    private void addInternshipToList(Application a, JSONObject jsonObject) throws DuplicateException {
        String name = jsonObject.getString("name");
        Student student = new Student("Alex", 1);
        Internship internship = new Internship(name, "Due Date", "accepted", "Bachelors", "Second Year");
        a.addInternship(student, internship);
    }
}

 */

