package persistence;

/*
import model.Portfolio;
import org.json.JSONArray;
import org.json.JSONObject;


public class JsonReader {
    private String source;
    ArrayList<Internship> internships = new ArrayList<Internship>();


    // EFFECTS: constructs reader to read from source file
    public JsonReader(String source) {
        this.source = source;
    }

    // EFFECTS: reads portfolio from file and returns it;
    // throws IOException if an error occurs reading data from file
    public Portfolio read() throws IOException {
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
    public Portfolio parseMyPortfolio(JSONObject jsonObject) throws IOException {
        //JSONObject jsonObject1 = new JSONObject(jsonData);
        String name = jsonObject.getString("name");
        double balance = jsonObject.getDouble("balance");
        Portfolio p = new Portfolio(new ArrayList<Internship>());
        Internship i = new Internship("ETF",0.3, 0);
        addMultipleInternships(p, i, jsonObject);
        return p;
    }

    // MODIFIES: mp
    // EFFECTS: parses addMultipleBonds from JSON object and adds them to MyPortfolio
    private void addMultipleInternships(Portfolio p, Internship i, JSONObject jsonObject) {
        JSONArray jsonArray = jsonObject.getJSONArray("thingies");
        for (Object json : jsonArray) {
            JSONObject nextBond = (JSONObject) json;
            addBondToList(p, i, nextBond);
        }
    }

    // MODIFIES: mp
    // EFFECTS: parses addBondToList from JSON object and adds it to MyPortfolio
    private void addBondToList(Portfolio p, Internship b, JSONObject jsonObject) {
        String name = jsonObject.getString("name");
        Internship internship = new Internship(name, b.getDueDate(), b.getStatus());
        p.addInternship(internship);
    }
}

 */
