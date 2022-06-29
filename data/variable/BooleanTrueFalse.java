
public class LogicTrick {

	public LogicTrick() {

		boolean value = false;

		// == false
		if (value == false) {
			System.out.println("value == false");
		}

		// == false
		if (!value) {
			System.out.println("!value == " + !value);
		}
	}
}
