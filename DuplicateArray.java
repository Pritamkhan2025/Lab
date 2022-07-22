/*
 * @author pritam khan
 */

package Array2d;

public class DuplicateArray {//class
	public static void main(String args[]) {
		int a[]= {5,2,7,7,5};//insert values
		System.out.println("Duplicate values are: ");
		
		for(int i=0;i<a.length;i++) {//logic
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])//checking value
					System.out.println(a[j]);//print value
			}
		}
	}

}
