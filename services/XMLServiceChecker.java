import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XMLServiceChecker {

    public static void main(String[] args) {
        String serviceUrl = "http://example.com/service";
        String expectedElementName = "result";
        
        try {
            // Open a connection to the service URL
            URL url = new URL(serviceUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            // Read the response from the service
            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            StringBuilder responseBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                responseBuilder.append(line);
            }
            reader.close();
            
            // Parse the XML response into a Document object
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);
            
            // Check if the expected element is present in the response
            boolean elementFound = document.getElementsByTagName(expectedElementName).getLength() > 0;
            if (elementFound) {
                System.out.println("Service check passed");
            } else {
                System.out.println("Service check failed");
            }
        } catch (Exception e) {
            System.err.println("Error while checking service: " + e.getMessage());
        }
    }
}
