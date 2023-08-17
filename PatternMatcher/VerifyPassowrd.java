package PatternMatcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyPassowrd {

	public static void main(String[] args) {
try (//		Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner("krishan@123")) {
			String password = scanner.nextLine();
			System.out.println("Enter the password: " + password);

			Pattern pattern;
			Matcher matcher;

			// Check for special character
			pattern = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]");
			matcher = pattern.matcher(password);
			if (!matcher.find()) {
				System.out.println("Password must contain a special character");
			}

			// Check for capital letter
			pattern = Pattern.compile("[A-Z]");
			matcher = pattern.matcher(password);
			if (!matcher.find()) {
				System.out.println("Password must contain a capital letter");
			}

			// Check for Number
			pattern = Pattern.compile("[0-9]");
			matcher = pattern.matcher(password);
			if (!matcher.find()) {
				System.out.println("Password must contain a number");
			}

			// Check for vowels
			pattern = Pattern.compile("[aeiouAEIOU]");
			matcher = pattern.matcher(password);
			if (!matcher.find()) {
				System.out.println("Password must contain a vowel");
			}
			
			// If all checks pass, then the password is considered valid
			if (matcher.find()) {
			    System.out.println("Password is valid");
			}else {
				System.out.print("Passowrd is invalid");
			}
		}

	}

}
