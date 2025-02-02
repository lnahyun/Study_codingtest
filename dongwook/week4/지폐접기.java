package Study_codingtest.dongwook.week4;
import java.util.*;

public class 지폐접기 {
    public static int solution(int[] wallet, int[] bill){
        int answer = 0;

        Arrays.sort(wallet);
        Arrays.sort(bill);
        while (!fit(wallet, bill)){
            bill[1] /= 2;
            Arrays.sort(bill);
            answer++;
        }
        return answer;
    }
    public static boolean fit(int[] a, int[] b){
        return (a[0] <= b[0]) && (a[1] <= b[1]) ||
                (a[0] <= b[1]) && (b[1] <= a[0]);
    }
}
