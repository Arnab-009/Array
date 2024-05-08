package J_array;
import java.util.*;
public class Assignment_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int m = sc.nextInt();
		System.out.println("Enter the number of column:");
		int n = sc.nextInt();
		
		int [][]arr = new int[m][n];
		int positive = 0;
		int negative = 0;
		int odd = 0;
		int even = 0;
		int zero = 0;
		
		System.out.println("Enter elements of the array:");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] > 0) {
					positive ++;
				}
				if(arr[i][j] < 0) {
					negative ++;
				}
				if((arr[i][j] % 2) != 0) {
					odd ++;
				}
				if((arr[i][j] % 2) == 0) {
					even ++;
				}
				if(arr[i][j] == 0) {
					zero ++;
				}
			}
		}
		
		System.out.println("Number of positive numbers: "+ positive);
		System.out.println("Number of negative numbers: "+ negative);
		System.out.println("Number of odd numbers: "+ odd);
		System.out.println("Number of even numbers: "+ even);
		System.out.println("Number of 0: "+ zero);
	}
}

//T(n) = O(m*n) or O(n^2)
//S(n) = O(1)
