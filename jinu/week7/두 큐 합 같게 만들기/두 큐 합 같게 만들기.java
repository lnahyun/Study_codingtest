import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        int idx1 = 0;
        int idx2 = 0;
        long sum1 = 0;
        long sum2 = 0;

        for (int num : queue1) {
            q1.add(num);
            sum1 += num;
        }

        for (int num : queue2) {
            q2.add(num);
            sum2 += num;
        }

        int size = q1.size();
        long sumsum = sum1 + sum2;

        if(sumsum % 2 != 0) return -1;

        while(idx1 < 2*size && idx2 < 2*size){
            if(sum1 == sumsum/2) return answer;

            else if(sum1 > sum2){
                int n = q1.poll();
                q2.add(n);
                sum1 -= n;
                sum2 += n;
                idx1++;
            }

            else{
                int n = q2.poll();
                q1.add(n);
                sum1 += n;
                sum2 -= n;
                idx2++;
            }

            answer++;
        }


        return -1;
    }
}