import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        Integer[] paint = new Integer[n+1];
        for(int i = 0; i<=n; i++) {
            paint[i] = 1;
        }
        for(int i = 0; i<section.length; i++) {
            paint[section[i]] = 0;
        }
        
        Integer start;
        int result = 0;
        while(true) {
            start = Arrays.asList(paint).indexOf(0);
            if(start == null) break;
            if(start < 0 || start > n) break;
            for(int i = 0; i<m && (start+i)<=n; i++) {
                paint[start+i] = 1;
            }
            result++;
        }
        return result;
    }
}
