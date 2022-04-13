package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE1 {
public static void main(String[] args) {
	//regTest1();
	regTest2();
}

private static void regTest2() {
	// TODO Auto-generated method stub
	System.out.println(Pattern.matches("..h", "uuh"));
	System.out.println(Pattern.matches("[abc]", "abc"));
	System.out.println(Pattern.matches("[abc]", "a"));
	System.out.println(Pattern.matches("[abc]+", "aaabbv"));

	
}

private static void regTest1() {
	Pattern p =Pattern.compile(".k");
	Matcher m = p.matcher("oko");
	System.out.println(m.matches());
}
}
