package Regex;
/*
 * @pritam khan
 */
import java.util.StringTokenizer;

public class StringAll {
	public static void main(String args[]) {
		String s="Welcome to Java World";
		System.out.println("character at 5th position: "+s.charAt(5));
		System.out.println("compares: "+s.compareTo("Welcome"));
		System.out.println("concatenates: "+s.concat("-Let us learn"));
		System.out.println("position of a: "+s.indexOf('a'));
		System.out.println("string betwen 4 to 10: "+s.substring(4,10));
		System.out.println("Lowercase: "+s.toLowerCase());
		
		
		
		StringBuffer s1=new StringBuffer("This is StringBuffer");
		System.out.println(s1.append("-This is a sample program"));
		System.out.println(s1.insert(21, "Object"));
		System.out.println(s1.replace(14,20, "Builder"));
		System.out.println(s1.reverse());
		
		
		StringTokenizer s2=new StringTokenizer("c:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE","\\");
		System.out.println("Drive: "+s2.nextToken()+"\\");
		System.out.println("Folder: "+s2.nextToken()+"||"+s2.nextToken()+"||"+s2.nextToken());
		System.out.println("Files: "+s2.nextToken());

		
	}
	
}
