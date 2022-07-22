package Array2d;

public class CopyArray {//class
	public static void main(String args[]) {
		//declaring source array
		char[]copyFrom= {'c','d','a','b','e','f','g','h'};
		//declaring destination of array
	char[]copyTo=new char[7];
	System.arraycopy(copyFrom,0,copyTo,0,7);
	//print destination of array
	System.out.println(String.valueOf(copyTo));

}
}