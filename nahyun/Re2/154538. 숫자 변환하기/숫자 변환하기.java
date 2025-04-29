import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int MAX = Integer.MAX_VALUE;
        int[] dp = new int[y + 1];
        Arrays.fill(dp, MAX); //최댓값으로 초기화
        dp[x] = 0;

        for (int i = x; i <= y; i++) {
            //아직 x->i 거리 모름
            if (dp[i] == Integer.MAX_VALUE) continue; 

            if (i + n <= y) {
                dp[i + n] = Math.min(dp[i + n], dp[i] + 1);
            }
            if (i * 2 <= y) {
                dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
            }
            if (i * 3 <= y) {
                dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
            }
        }

        return (dp[y] == Integer.MAX_VALUE) ? -1 : dp[y];
    }
}
