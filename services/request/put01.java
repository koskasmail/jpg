import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ExamplePutRequest {
    
    public static void main(String[] args) throws IOException {
        
        // URL of the API endpoint
        String url = "https://example.com/api/users/1";
        
        // JSON data to be sent in the request body
        String json = "{\"name\": \"John Smith\", \"email\": \"john.smith@example.com\"}";
        
        // Set up the HTTP connection and set the request method to PUT
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestMethod("PUT");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);
        
        // Write the JSON data to the request body
        con.getOutputStream().write(json.getBytes());
        
        // Send the request and read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String response = "";
        String line;
        while ((line = reader.readLine()) != null) {
            response += line;
        }
        reader.close();
        
        // Print the response
        System.out.println(response);
    }
}
