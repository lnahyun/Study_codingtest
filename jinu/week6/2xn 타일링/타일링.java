class Solution {
    public int solution(int n) {
        int answer = 0;

        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 2;

        for(int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
            arr[i] %= 1000000007;

        }

        answer = arr[n-1];

        return answer;
    }
}

/*
n=1, 1
n=2, 2
n=3, 3
n=4, 5
n=5, 8

피보나치 수열
*/