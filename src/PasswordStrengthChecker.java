import java.util.Scanner;

public class PasswordStrengthChecker {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int strengthScore = 0;
		
		// Get password as an input
		
		System.out.print("Enter your password: ");
		String password = scnr.nextLine();
		
		
		//Check password Strength
		//Display Result
		System.out.println(hideCharacters(password));
		System.out.println(passwordStrength(strengthScore, password));
	}
	
	/**
	 * Displays password in console with * 
	 * @param password user created password
	 * @return gives string back as a series of *
	 */
	public static String hideCharacters(String password) {
		
		StringBuilder hiddenPassword = new StringBuilder();
		
		for (int i = 0; i < password.length(); i++) {
			hiddenPassword.append("*");
		}
		
		return hiddenPassword.toString();
		}
	
	/**
	 * isCorrectLength determines if password is 8 characters or longer
	 * @param password user created password
	 * @param strengthScore score to determine the strength output
	 * @return true if password is correct length else false
	 */
	public static boolean isCorrectLength(String password) {
		if (password.length() >= 8 && !password.contains(" ")) {
			return true;
		} else {
			System.out.println("*** PASSWORD LENGTH INCORRECT ***");
			return false;
		}
	}

	/**
	 * Determines if the password contains an upper case character
	 * @param password user created password
	 * @return true is password contains an upper case else false
	 */
	public static boolean hasUppercase(String password) {
		if (password.matches(".*[A-Z].*")) {
			return true;
		}else {
			System.out.println("*** PASSWORD MUST CONTAIN AT LEAST ONE UPPERCASE ***");
			return false;
		}
	}
	
	/**
	 * Determines if the password contains a special character
	 * @param password user created password
	 * @return true if password contains a special character else false
	 */
	
	public static boolean hasSpecialCharacter(String password) {
		if (password.matches(".*[^a-zA-Z0-9].*")) {
			return true;
		} else {
			System.out.println("*** PASSWORD MUST CONTAIN AT LEAST ONE SPECIAL CHARACTER ***");
			return false;
		}
	}
	
	/**
	 * Determines the strength level of the password
	 * @param strengthScore ranges from 0-3 based on password input
	 * @param password user created password
	 * @return weak, medium, strong based on a score between 1-3
	 */
	public static String passwordStrength(int strengthScore, String password) {
		
		if (isCorrectLength(password)) {
			strengthScore++;
		}
		if(hasUppercase(password)) {
			strengthScore++;
		}
		if(hasSpecialCharacter(password)) {
			strengthScore++;
		}
		if (hasNumbers(password)) {
			strengthScore++;
		}
		
		if (strengthScore == 1) {
			return "Weak";
		} else if (strengthScore == 3 || strengthScore == 2) {
			return "Medium";
		} else if (strengthScore == 4) {
			return "Strong";
		}
		return "*** PASSWORD NOT STRONG ENOUGH TRY AGAIN ***";
	}
	
	/**
	 * Determines if the password contains a number
	 * @param password user entered password
	 * @return if password contains at least one number return true else false
	 */
	public static boolean hasNumbers(String password) {
		if (password.matches(".*\\d.*")) {
			return true;
		} else {
			System.out.println("*** PASSWORD MUST CONTAIN AT LEAST ONE NUMBER ***");
			return false;
		}
	}
}
