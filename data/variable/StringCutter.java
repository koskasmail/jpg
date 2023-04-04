import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCutter {
    
    public static void main(String[] args) throws Exception {
        String input = "This is a string with \"quoted text\" and \"more quoted text\" inside.";

        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("\"([^\"]*)\"");

        // Create a JSON array node
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode arrayNode = mapper.createArrayNode();

        // Extract all the quoted substrings and add them to the JSON array
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String quotedText = matcher.group(1);
            ObjectNode objectNode = mapper.createObjectNode();
            objectNode.put("quotedText", quotedText);
            arrayNode.add(objectNode);
        }

        // Convert the JSON array to a string and print it
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode);
        System.out.println(json);
    }
}
