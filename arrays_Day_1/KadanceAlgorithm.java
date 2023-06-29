package arrays_Day_1;

public class KadanceAlgorithm {
	public static long maxSubarraySum(int[] arr, int n) {
		int maxi = 0,sum = 0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			maxi = Integer.max(maxi, sum);

			if(sum < 0){
				sum = 0;
			}
		}
		return maxi;
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 7, -4, 3, 2, -10, 9, 1};
		System.out.println("Maximum Subarray Sum = "+maxSubarraySum(arr, arr.length));

	}

}
