public class prime_number {
    class Solution {
        // 소수 판별 함수
        private boolean isPrime(long num) {
            if (num < 2) return false;
            if (num == 2) return true;
            if (num % 2 == 0) return false;
            for (long i = 3; i * i <= num; i += 2) {
                if (num % i == 0) return false;
            }
            return true;
        }

        // n을 k진수로 변환하는 함수
        private String convertToBase(int n, int k) {
            return Integer.toString(n, k);
        }

        public int solution(int n, int k) {
            String kBase = convertToBase(n, k); // k진수 변환
            String[] candidates = kBase.split("0"); // 0을 기준으로 분할

            int primeCount = 0;
            for (String numStr : candidates) {
                if (!numStr.isEmpty()) {
                    long num = Long.parseLong(numStr); // 변환된 숫자가 클 수 있음
                    if (isPrime(num)) {
                        primeCount++;
                    }
                }
            }
            return primeCount;
        }
    }
}
