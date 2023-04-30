
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jsb {

	public Jsb() throws Exception {
		JArrayList2Array();
	}

	public void JArrayList2Array() throws Exception {

		String output = "This is a string with \"quoted text\" and \"more quoted text\" inside \"{F51B5D8A-D646-411F-8DDB-D5729DFD6BA9}\",\"{F51B5D8A-D646-411F-1111-D5729DFD6BA9}\" ";

		Pattern pattern = Pattern.compile("\\{([^}]+)}"); /// ("\{.*?\}");
		Matcher matcher = pattern.matcher(output);

		ArrayList<String> findList = new ArrayList<String>();

		String quotedText = "";
		while (matcher.find()) {
			quotedText = matcher.group(1);
			findList.add(matcher.group(1));
		}

		System.err.println(">>>Output - ArrayList <<<");
		for (int i = 0; i < findList.size(); i++) {
			System.err.println(findList.get(i));
		}

		System.err.println("\n>>>Output - Array[] <<<");
		String[] myArray = findList.toArray(new String[0]);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
}
