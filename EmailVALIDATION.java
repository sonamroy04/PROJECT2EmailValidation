package project2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVALIDATION {

	public static void main(String[] args) {
	
		String email = "diaz.sarah@gmail.com";
		System.out.println(valEmail(email));

	}
	public static boolean valEmail(String input) {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]"
				+ "+\\.[A-Z]{2,6}$";
		Pattern emailpat = Pattern.compile(emailRegex,Pattern
				.CASE_INSENSITIVE);
		
		Matcher matcher = emailpat.matcher(input);
		return matcher.find();
	}

}
