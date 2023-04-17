package util.main.string;
//
//public class StringCutter {
//
//	public StringCutter() {
//		// TODO Auto-generated constructor stub
//	}
//
//}

import java.awt.List;
import java.util.ArrayList;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.node.ArrayNode;
//import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCutterSimple1 {
    
    public StringCutterSimple1() throws Exception {
    	
    	ArrayList<String> findList = new ArrayList<String>();
    	
        String input = "This is a string with \"quoted text\" and \"more quoted text\" inside.";
        Pattern pattern = Pattern.compile("\"([^\"]*)\"");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String quotedText = matcher.group(1);
            findList.add(matcher.group(1));
        }
        System.out.println("----[output]------------");
        System.out.println(findList);

    }
}

