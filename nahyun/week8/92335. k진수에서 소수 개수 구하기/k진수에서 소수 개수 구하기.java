import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n, int k) {
        //k진수 바꾸기
        StringBuilder sb = new StringBuilder();
        if(k == 10) {
            sb.append(n);
        }
        else {
            while(true) {
                if((n/k) == 0) {
                    int num = n%k;
                    sb.append(num);
                    break;
                }
                int num = n%k;
                sb.append(num);
                n = n / k;
            }
            sb.reverse();
        }
        
        String N = sb.toString();
        int result = 0;
        while(true) {
            int index = N.indexOf("0");
            if(index == -1) {
                if(isPrime(N)) result++;
                break;
            }
            String checkNum = N.substring(0, index);
            if(isPrime(checkNum)) result++;
            N = N.substring(index+1);
        }
        return result;
    }
    public static boolean isPrime(String num) {
        if(num.isEmpty()) return false;
        long n = Long.parseLong(num);
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;
        
        for(long i = 3; i*i <= n; i+=2) {
            if(n%i == 0) return false;
        }
        return true;
    }
}
