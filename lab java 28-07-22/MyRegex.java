package Regex;
/*
 * @pritam khan
 */
import java.util.regex.Pattern;

public class MyRegex {
	public static void check(String s) {
		String ip = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";//regex logic
		String pattern= ip+"."+ip+"."+ip+"."+ip;//pattern for logic
		boolean b=Pattern.matches(pattern,s);
		System.out.println(b);//print boolean value
    }
	
	public static void main(String args[]) {
		//check method
		MyRegex.check("000.12.12.034");
		MyRegex.check("121.234.12.12");
		MyRegex.check("23.45.12.56");
		MyRegex.check("00.12.123.123123.123");
		MyRegex.check("122.23");
		MyRegex.check("Hello.IP");
		
		
	}

}
