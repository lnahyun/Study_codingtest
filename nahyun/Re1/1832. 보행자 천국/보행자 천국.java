import java.io.*;
import java.util.*;

class Solution {
    int MOD = 20170805;
    int[][] dp, map;
    int M, N;
    public int solution(int m, int n, int[][] cityMap) {
        M = m; N = n;
        dp = new int[m][n];
        map = cityMap;
        dp[0][0] = 1; //시작점
        
        //가장 윗 가로줄(가로로 오는 경우밖에 없음 -> 가로만 신경쓰면 됨)
        for(int i = 1; i<n; i++) {
            if(map[0][i] != 1) {
                dp[0][i] = dp[0][i-1];
            }
            
        }
        
        //가장 왼 세로줄(세로로 내려오는 경우밖에 없음) 
        for(int i = 1; i<m; i++) {
            if(map[i][0] != 1) {
                dp[i][0] = dp[i-1][0];
            }
        }
        
        for(int i = 1; i<m; i++) { //세
            for(int j = 1; j<n; j++) { //가
                if(map[i][j] == 0) {
                    //left = 1, top = 0
                    dp[i][j] = (checkCount(i, j, 1) + checkCount(i, j, 0)) % MOD;
                }
                else dp[i][j] = 0;
            }
        }
        return dp[m-1][n-1];
        
    }
    int[] dx = {-1, 0};
    int[] dy = {0, -1};
    public int checkCount(int x, int y, int d) {
        int reX = x + dx[d];
        int reY = y + dy[d];
        boolean check = isRange(reX, reY);
        if(check) {
            if(map[reX][reY] == 0) {
                return dp[reX][reY];
            }
            else if(map[reX][reY] == 2) {
                return checkCount(reX, reY, d);
            }
            else return 0;
            
        }
        return 0;
    }
    
    public boolean isRange(int x, int y) {
        return (x < M && x >= 0) && (y<N && y >= 0);
    }
}
