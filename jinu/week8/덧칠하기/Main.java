class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]  = 1;
        }

        for(int i=0; i<section.length; i++){
            int num = section[i]-1;
            arr[num] = 0;
        }

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                for(int j=0; j<m; j++){
                    if(i+j < n)
                        arr[j+i] = 1;
                }
                i += (m-1);
                answer++;
            }
        }


        return answer;
    }
}
