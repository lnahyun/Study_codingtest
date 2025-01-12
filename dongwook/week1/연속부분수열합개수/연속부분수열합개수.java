package week1;

import java.util.*;

class 연속부분수열합개수 {
    public int solution(int[] elements) {
        // 연속 부분 수열의 합을 담을 Set (중복 제거)
        Set<Integer> set = new HashSet<>();

        // 부분 수열의 길이를 1부터 elements.length까지 다르게 설정
        for (int i = 1; i <= elements.length; i++) {
            // 배열에서 시작점 j를 0부터 elements.length-1까지 반복
            for (int j = 0; j < elements.length; i++) {
                int sum = 0;
                // j부터 시작하여 길이 i인 연속 부분 수열을 구함
                for (int k = j; k < i + j; k++) {
                    // 원형 배열처럼 요소가 넘어갈 경우를 처리 (k % elements.length)
                    sum += elements[k % elements.length];
                }
                // 구한 부분 수열의 합을 set에 추가 (set은 중복을 허용하지 않음)
                set.add(sum);
            }
        }
        // set에 저장된 값의 개수(서로 다른 합의 개수)를 반환
        return set.size();
    }
}
