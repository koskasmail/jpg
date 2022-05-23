package examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex_003 {

	private String[] mergeArray(String[] arr1, String[] arr2) {
		String[] arr = new String[arr1.length + arr2.length];

		/* count the arr[] element */
		int count = 0;

		/* copy arr1[] to arr[] */
		System.out.print("<001>");
		for (int i = 0; i < arr1.length; i++) {
			arr[i] = arr1[i];
			System.out.print(", " + arr1[i]);
			count++;
		}

		/* copy arr2[] to arr[] */
		System.out.print("\n<002>");
		for (int j = 0; j < arr1.length; j++) {
			arr[count++] = arr2[j];
			System.out.print(", " + arr2[j]);
		}

		/* create "list" and copy "arr[]" to it. */
		System.out.print("\n<003>");
		List<String> lists = Arrays.asList(arr);
		System.out.print(lists);

		// create "set"
		Set<String> set = new HashSet<String>();

		// "Set" value from "list" array
		for (String s : lists) {
			set.add(s);
		}

		System.out.print("\n<004> print the Value (no duplicate) ");
		System.out.print("\n" + set);

		// HashSet --> String
		arr = new String[set.size()];
		set.toArray(arr);

		System.out.print("\n<004> print 'set[]' arry the Value (no duplicate) ");
		System.out.print("\nset = " + set);

		return arr;
	}

	/************************************************************/
	private static void printResult(String[] result) {

		System.out.println("\nprintResult");
		for (String r : result) {
			System.out.print(r + ", ");
		}
	}

	public Ex_003() {
		String[] arr1 = new String[] { "a", "b", "c" };
		String[] arr2 = new String[] { "c", "d", "e" };

		String[] arr = mergeArray(arr1, arr2);

		printResult(arr);
	}
}
