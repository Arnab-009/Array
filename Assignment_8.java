package J_array;
import java.util.*;
public class Assignment_8 {
	public static void main(String[] srgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row & column:");
		int n = sc.nextInt();
		int [][]arr = new int[n][n];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("Elements of diagonals: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == j) {
					System.out.print(arr[i][j]+" ");
				}
				else if((i+j) == (n-1)) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		sc.close();
	}
}
//T(n) = O(n^2)
//S(n) = O(1)
