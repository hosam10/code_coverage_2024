package code_coverage_4.code_coverage_4;

public class StringValidator {

	/**
	 * Validates if the input string is exactly 7 alphanumeric characters.
	 * 
	 * @param input The string to validate.
	 * @return "Valid Value" if the string is exactly 7 alphanumeric characters,
	 *         "Invalid Value" otherwise.
	 */
	public static String validateString(String input) {
		if (input == null || input.isEmpty()) {
			return "Invalid Value";
		}
		// Check if the string matches the pattern for exactly 7 alphanumeric characters
		if (input.matches("^[a-zA-Z0-9]{7}$")) {
			return "Valid Value";
		} else {
			return "Invalid Value";
		}
	}
}
