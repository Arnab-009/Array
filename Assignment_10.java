package J_array;

public class Assignment_10 {
	public static void main(String[] args) {
		int [][]arr = {{1,2,3,4,5},{3,4,5,6,7},{7,6,5,4,3},{8,7,6,5,4},{1,2,37,8,0}};
		int n = arr.length;
		int m = arr[0].length;
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i][n/2] + " ");
		}
		for(int j=0; j<m; j++) {
			if(j != n/2) {
				System.out.print(arr[n/2][j] + " ");
			}
		}
	}
}
//T(n) = O(n)
//S(n) = O(1)