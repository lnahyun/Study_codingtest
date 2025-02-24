class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.trim().split("\\s+");

        int[] num = new int[arr.length];
        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }

        int max = num[0];
        int min = num[0];

        for(int i=1; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }
        }

        answer = Integer.toString(min) + " " + Integer.toString(max);

        return answer;
    }
}