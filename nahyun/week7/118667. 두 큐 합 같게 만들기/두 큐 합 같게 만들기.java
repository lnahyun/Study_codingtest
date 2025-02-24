import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();
        
        long Q1Sum = 0; long Q2Sum = 0;
        for(int i = 0; i<queue1.length; i++) {
            Q1.offer(queue1[i]);
            Q1Sum += queue1[i];
        }
        for(int i = 0; i<queue2.length; i++) {
            Q2.offer(queue2[i]);
            Q2Sum += queue2[i];
        }
        if(((Q1Sum+Q2Sum) % 2) != 0) return -1;
        int max = queue1.length + queue2.length + 2;
        int answer = calF(Q1, Q2, Q1Sum, Q2Sum, max);
        return answer;
    }
    public int calF(Queue<Integer> Q1, Queue<Integer> Q2, long Q1Sum, long Q2Sum, int max) {
        int answer = 0;
        while(true) {
            //종료 조건
            if(max < answer) return -1;
            else if(Q1Sum == Q2Sum) return answer;
            
            //queue1에서 빼기
            if(Q1Sum >= Q2Sum) {
                answer++;
                int temp = Q1.poll();
                Q2.offer(temp);
                Q1Sum -= temp;
                Q2Sum += temp;
            }
            
            //queue2에서 빼기
            else {
                answer++;
                int temp = Q2.poll();
                Q1.offer(temp);
                Q2Sum -= temp;
                Q1Sum += temp;
            }    
        }
        
    }
}
