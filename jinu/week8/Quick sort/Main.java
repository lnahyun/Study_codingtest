class QuickSort {
    public static void quicksort(int[] list, int left, int right) {
        if (left < right) {
            int pivot = list[left];
            int i = left, j = right + 1;

            do {
                do { i++; } while (i <= right && list[i] < pivot);
                do { j--; } while (list[j] > pivot);

                if (i < j) {
                    swap(list, i, j);
                }
            } while (i < j);

            swap(list, left, j);

            quicksort(list, left, j - 1);
            quicksort(list, j + 1, right);
        }
    }

    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void main(String[] args) {
        int[] list = {34, 7, 23, 32, 5, 62};
        quicksort(list, 0, list.length - 1);

        System.out.println("정렬된 배열:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
