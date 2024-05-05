package J_array;

public class Assignment_1 {
	public static void main(String[] args) {
		int arr[] = {3,20,4,6,9};
		int sum = 0;
		int i = 0;
		int n = arr.length;
		while(i<n) {
			sum += arr[i];
			i+=2;
		}
		System.out.println(sum);
	}
}
