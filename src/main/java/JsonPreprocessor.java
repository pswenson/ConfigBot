import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Map;

import java.io.File;

/**
 * Created by philswenson on 8/12/14.
 */
public class JsonPreprocessor {
    private String jsonFilePath;

    public JsonPreprocessor(String jsonFilePath) throws Exception{
        this(jsonFilePath, null);
    }

    public JsonPreprocessor(String jsonFilePath, Map<String, String> overrides) throws Exception{
        this.jsonFilePath = jsonFilePath;
        JsonFactory jsonFactory = new JsonFactory();
// configure, if necessary:
        jsonFactory.enable(JsonParser.Feature.ALLOW_COMMENTS);

        JsonParser jp = jsonFactory.createParser(new File(jsonFilePath));
        File jsonFile = new File(jsonFilePath);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonFile);
        ObjectNode objNode = (ObjectNode)jsonNode;
        System.out.println("blah");
        // the expression would be phoneNumbers[0].type , value = "blah"
        ObjectNode obj = (ObjectNode)objNode.get("phoneNumbers").get(0);
        obj.put("type", "blah");

        // read in json file
        // remove comments
        // perform string substitution
        // convert to json objects

    }

    public static void main(String[] args) throws Exception {
        JsonPreprocessor jsonPreprocessor = new JsonPreprocessor("/Users/philswenson/dev/ConfigBot/src/test/resources/database.json");
    }


}
