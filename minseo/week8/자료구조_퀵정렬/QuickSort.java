private void swap(int[] a, int i, int ii) {
    int temp = a[i];
    a[i] = a[ii];
    a[ii] = temp;
}

public void quickSort(int[] a, int start, int end) {
    if (start >= end) return;
    
    int pivotIndex = start + (int) (Math.random() * (end - start + 1));
    swap(a, start, pivotIndex);
    int pivot = a[start]; 

    int i = start + 1;
    int j = end;

    while (i <= j) {
        while (i <= end && a[i] < pivot) i++;  // 왼쪽에서 피벗보다 큰 값 찾기
        while (j > start && a[j] > pivot) j--; // 오른쪽에서 피벗보다 작은 값 찾기

        if (i <= j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    swap(a, start, j);  

    
    quickSort(a, start, j - 1);
    quickSort(a, j + 1, end);
}
