import java.util.Scanner;

public class PasswordStrengthChecker {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int strengthScore = 0;
		
		// Get password as an input
		
		System.out.print("Enter your password: ");
		String password = scnr.nextLine();
		//Check password Strength
		if (isCorrectLength(password)) {
			strengthScore++;
		}
		//Display Result
		System.out.println(password);
		System.out.println(strengthScore);
	}
	
	/**
	 * isCorrectLength determines if password is 8 characters or longer
	 * @param password user created password
	 * @param strengthScore score to determine the strength output
	 * @return true if password is correct length else false
	 */
	
	
	public static boolean isCorrectLength(String password) {
		if (password.length() >= 8) {
			return true;
		} else {
			System.out.print("*** PASSWORD LENGTH INCORRECT ***");
			return false;
		}
	}
	
	/**
	 * checkUppercase determines if the password contains at least one uppercase letter
	 */
}
