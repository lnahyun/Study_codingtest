class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        int[] score = new int [3];
        int index = 0;
        char[] arr = dartResult.toCharArray();

        for(int i=0; i < arr.length; i++){
            if(arr[i] == '1' && arr[i+1] == '0'){
                score[index] = 10;
                index++;
                i++;
            }
            else if(arr[i] >= '0' && arr[i] <= '9'){
                score[index] = Integer.parseInt(String.valueOf(arr[i]));
                index++;
            }

            else if(arr[i] == 'D') score[index-1] = (int)Math.pow(score[index-1],2);
            else if(arr[i] == 'T') score[index-1] = (int)Math.pow(score[index-1],3);
            else if(arr[i] == '*') {
                if(index <= 1){
                    score[index -1] *= 2;
                }
                else{
                    score[index-1] *= 2;
                    score[index-2] *= 2;
                }
            }
            else if(arr[i] == '#') score[index-1] *= -1;

        }


        answer = score[0] + score[1] + score[2];


        return answer;
    }
}