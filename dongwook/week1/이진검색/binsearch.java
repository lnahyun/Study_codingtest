package week1;

public class binsearch {
    // 이진 탐색을 구현한 재귀 함수
    // list[]: 검색할 배열, key: 찾고자 하는 값, left: 배열의 왼쪽 인덱스, right: 배열의 오른쪽 인덱스
    public static int binsearch(int list[], int key, int left, int right){
        // left가 right보다 작거나 같다면, 아직 배열 안에 key가 있을 수 있음
        if (left <= right){
            int middle = (left + right) / 2;

            // 중간값이 key보다 작은 경우, key는 오른쪽 절반에 있을 가능성이 있음
            if (list[middle] < key){
                return binsearch(list, key, middle + 1, right);
            }
            // 중간값이 key와 같다면, key를 찾은 것이므로 중간 인덱스를 반환
            else if (list[middle] == key){
                return middle;
            }
            // 중간값이 key보다 큰 경우, key는 왼쪽 절반에 있을 가능성이 있음
            else{
                return binsearch(list, key, left, middle - 1);
            }
        }
        return -1; // 배열에 key가 없다면 -1을 반환
    }
}
