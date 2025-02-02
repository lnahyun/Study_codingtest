package Study_codingtest.dongwook.week4;

class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = 0;

        while (idx < section.length) {
            int start = section[idx];
            int end = start + m - 1;
          
            while (idx < section.length && section[idx] <= end) {
                idx++;
            }

            answer++;
        }

        return answer;
    }
}
