/*
 * @author pritam khan
 */

package Array2d;

public class PositionArray {//class
	public static void main(String args[]) {
		String arr[]= {"a","b","c","d","e"};//insert value
		System.out.println("Elements present in odd position are: ");
		
		for(int i=0;i<arr.length;i=i+2) {//loop for odd position
			System.out.println(arr[i]);//print value
		}
	}
	
	

}
