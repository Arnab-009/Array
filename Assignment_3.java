package J_array;

public class Assignment_3 {
	public static void main(String[] args) {
		int arr[] = {34,21,54,65,43,44,66,80,99,12,134,68};
		int n = arr.length;
		int max = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.print(max);
	}
}
