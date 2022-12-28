
package bubble_sort;
import java.util.Arrays;
public class susobhan {
	public static void main(String args[]) {
		
		int[] arr = { -2, 45, 0, 11, -9 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n - i - 1; j++) {
				
				 if (arr[j] > arr[j + 1]) {
					 // if condition (yes);
					 //swap
					 int temp = arr[j];
			          arr[j] = arr[j + 1];
			          arr[j + 1] = temp;
			        }
				 }
			}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		
		
			
		}
		
	}


}


