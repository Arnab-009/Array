package J_array;

public class Assignment_4 {
	public static void main(String[] args) {
		int arr[] = {34,21,54,65,43,44,66,12,134,68};
		int n = arr.length;
		int max1 = 0;
		int max2 = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]>max1) {
				max1 = arr[i];
			}
		}
		for(int i=0; i<n; i++) {
			if(arr[i]>max2 && arr[i]<max1) {
				max2 = arr[i];
			}
		}
		System.out.print(max2);
	}
}
