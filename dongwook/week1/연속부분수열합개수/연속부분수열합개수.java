package week1;

import java.util.*;

class 연속부분수열합개수 {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; i++) {
                int sum = 0;
                for (int k = j; k < i + j; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}