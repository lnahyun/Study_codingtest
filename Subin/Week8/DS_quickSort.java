package weel8;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 6, 20, 10, 7, 11, 15, 9 };
        quickSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        // 정렬하지 않고 return
        if (start >= end)
            return;

        // 가장 왼쪽의 값을 pivot으로 지정, start+1 부터 비교
        int pivot = start;
        int low = start + 1;
        int high = end;

        // low 부분배열의 왼쪽, high은 오른쪽
        while (low <= high) {
            while (low <= end && arr[low] <= arr[pivot]) // 큰 값을 만날 때까지
                low++;
            while (high > start && arr[high] >= arr[pivot]) // 작은 값을 만날 때까지
                high--;
            if (low > high)				 // 엇갈리면 기준과 교체
                swap(arr, high, pivot);
            else
                swap(arr, low, high);			 // 엇갈리지 않으면 low, high 값 교체
        }

        // 엇갈렸을 경우,교체 후 피벗을 기준으로 분할
        quickSort(arr, start, high - 1);
        quickSort(arr, high + 1, end);

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
