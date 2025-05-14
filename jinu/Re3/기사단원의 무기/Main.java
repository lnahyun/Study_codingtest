class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];

        for(int i=0; i<arr.length; i++){
            arr[i] = divisor(i+1);

            if(arr[i] > limit){
                arr[i] = power;
            }

            answer += arr[i];
        }


        return answer;
    }

    public static int divisor(int num){
        int count = 0;

        for(int i=1; i*i<= num; i++){
            if(num%i == 0) {
                count++;
                if(i != num/i) count++;
            }
        }

        return count;
    }
}