import org.json.JSONArray;
import org.json.JSONObject;

public class JSONObject_to_int_array {

	public JSONObject_to_int_array() {
		String jsonStr = "{\"numbers\": [1, 2, 3, 4, 5]}";

		// Create a JSONObject from the JSON string
		JSONObject jsonObject = new JSONObject(jsonStr);

		// Get the JSONArray with key "numbers" from the JSONObject
		JSONArray jsonArray = jsonObject.getJSONArray("numbers");

		// Create an integer array to store the values
		int[] intArray = new int[jsonArray.length()];

		// Iterate through the JSONArray and convert each element to an integer
		for (int i = 0; i < jsonArray.length(); i++) {
			intArray[i] = jsonArray.getInt(i);
		}

		// Print the integer array
		for (int num : intArray) {
			System.out.println(num);
		}
	}

}
