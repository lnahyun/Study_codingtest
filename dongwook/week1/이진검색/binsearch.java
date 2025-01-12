package week1;

public class binsearch {
    public static int binsearch(int list[], int key, int left, int right){
        if (left <= right){
            int middle = (left + right) / 2;

            if (list[middle] < key){
                return binsearch(list, key, middle + 1, right);
            }
            else if (list[middle] == key){
                return middle;
            }
            else{
                return binsearch(list, key, left, middle - 1);
            }
        }
        return -1;
    }
}
