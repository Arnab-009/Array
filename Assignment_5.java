package J_array;

public class Assignment_5 {
	public static void main(String[] args) {
		int arr[] = {1,4,7,3,2,6,5};
		int n = arr.length;
		int peak = 0;
		
		for(int i=1; i<n-1; i++) {
			if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) {
				peak = arr[i];
				break;
			}
		}
		System.out.print(peak);
	}	
}
