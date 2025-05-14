class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int index = i+1;
            int sum = i;
            while(true){
                if(sum == n){
                    answer++;
                    break;
                }
                if(sum > n) break;
                sum += index;
                index++;
            }
        }

        return answer;
    }
}