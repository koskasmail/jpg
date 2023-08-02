public class StringToIntArray {

	public StringToIntArray() {
		String numbers = "1,2,3,4,5";

		String[] numberStrings = numbers.split(",");
		int[] intArray = new int[numberStrings.length];

		for (int i = 0; i < numberStrings.length; i++) {
			intArray[i] = Integer.parseInt(numberStrings[i]);
		}

		// Print the resulting int array
		for (int num : intArray) {
			System.out.println(num);
		}
	}
}
