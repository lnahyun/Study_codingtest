package week8;

public class quicksort {
	public static int partition(int[] arr, int l, int r) {
		int pivot = arr[l];
		int low = l + 1;
		int high = r;
		while (low <= high) {
			while (low <= high && arr[low] < pivot) low++;
			while (low <= high && arr[high] > pivot) high--;
			
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		}
		
		int temp = arr[l];
		arr[l] = arr[high];
		arr[high] = temp;
		
		return high;
	}
  
	public static void quicksort(int[] arr, int left, int right) {
		if (left < right) {
			int pivot = partition(arr, left, right);
			
			quicksort(arr, left, pivot - 1);
			quicksort(arr, pivot + 1, right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 2, 1, 5, 7, 9, 6, 4, 8};
		 
	    quicksort(arr, 0, arr.length-1);
	    for (int i=0; i<arr.length; i++) {
	    	System.out.print(arr[i] + " ");
	    }
	}
}
