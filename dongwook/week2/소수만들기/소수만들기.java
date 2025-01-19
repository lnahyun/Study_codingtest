package Study_codingtest.dongwook.week2.소수만들기;

public class 소수만들기 {

    public int solution(int[] nums) {
        int answer = 0;

        // 3개의 수를 더한 값이 소수인지 확인하기 위한 루프
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    // 합이 소수인지 판별
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    // 소수 판별 함수
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
