package Study_codingtest.dongwook.week4;

class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = 0;

        while (idx < section.length) { // selection 배열을 순회하면서 덧칠 구간을 확인하는 while문
            int start = section[idx]; // 시작점
            int end = start + m - 1; // 끝점
            while (idx < section.length && section[idx] <= end) { // 구간을 덧칠할 수 있는 동안
                idx++; // idx 값 증가
            }
            answer++; // 덧칠 횟수 증가
        }
        return answer; // 최종 덧칠 횟수 반환
    }
}
