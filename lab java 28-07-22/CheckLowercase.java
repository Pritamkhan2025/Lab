package Regex;
/*
 * @pritam khan
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckLowercase {
	public static void check(String s) {
		
		String regex="^[a-z]+_[a-z]+$";//regex logic
		Pattern p=Pattern.compile(regex);//compile regex
		Matcher m=p.matcher(s);
		
		if(m.matches())//condition check
			System.out.println("Found a match");
		else
			System.out.println("Not matched");
	}
	public static void main(String args[]) {
		String s="java_exercises";
		String s1="Java_Exercises";
		check(s);//method for output
		check(s1);
	}
	
	

}
