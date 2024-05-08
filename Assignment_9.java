package J_array;

public class Assignment_9 {
	public static void main(String[] args) {
		int [][]arr = {{1,17,3},{12,5,6},{7,8,9}};
		int n = arr.length;
		int max = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
