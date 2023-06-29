package arrays_Day_1;

import java.util.ArrayList;

public class NextPermutation {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(1);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(0);
		arr.add(0);
		
		int ind=-1;
		int n = arr.size();
		
		// finding break-point
		for(int i=n-2;i>=0;i--) {
			if(arr.get(i) < arr.get(i+1)) {
				ind = i;
				break;
			}
		}
		
		/* edge case
		 if(ind == -1){
		 	reverse whole array and return it
		 }
		 */
		
		// Find the value greater than break point but the smallest one
		for(int i=n-1;i>ind;i--) {
			if(arr.get(i) > arr.get(ind)) {
				// swap them
				int temp = arr.get(i);
				arr.set(i, arr.get(ind));
				arr.set(ind, temp);
				break;
			}
		}
		
		// reverse from ind+1 -> end
		
		
		reverse(arr,ind+1,n-1);
		
		System.out.println(arr);

	}

	private static void reverse(ArrayList<Integer> arr, int s, int e) {
		while(s<e) {
			int temp = arr.get(s);
			arr.set(s, arr.get(e));
			arr.set(e, temp);
			s++;
			e--;
		}
		
	}

}
