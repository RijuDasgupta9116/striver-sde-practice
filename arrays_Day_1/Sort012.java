package arrays_Day_1;

public class Sort012 {
	public static void sort012(int[] arr)
    {
        int s=0,mid = 0,e=arr.length-1;

        while(mid<=e){
            if(arr[mid] == 0){
                // swap(arr[s],arr[mid]);
                int temp = arr[s];
                arr[s] = arr[mid];
                arr[mid] = temp;
                s++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                // swap(arr[mid],arr[e]);
                int temp = arr[mid];
                arr[mid] = arr[e];
                arr[e] = temp;
                e--;
            }

        }


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,2,1,0};
		
		sort012(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
