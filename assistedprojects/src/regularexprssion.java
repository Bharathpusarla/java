import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexprssion {
	public static void main(String[]args) {
		String pattern ="[a-z]+";
		String check ="pusarlaBharath@gmail.com";
		Pattern p=Pattern.compile(pattern);
		Matcher c =p.matcher(check);
		while (c.find())
			System.out.println(check.substring(c.start(),c.end()));
			
		
	}

}
