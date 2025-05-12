class Solution {
    public int solution(String s) {
        int answer = 0;
        int xCount = 0;
        int noXCount = 0;
        int size = s.length();
        char[] arr = s.toCharArray();

        char first = arr[0];

        for(int i=0; i<arr.length; i++){

            if(arr[i] == first){
                xCount += 1;
            }
            else noXCount += 1;

            if(xCount == noXCount){
                answer++;
                if(i != size-1) first = arr[i+1];
            }
            if(i == size-1 && xCount != noXCount) answer++;


        }

        return answer;
    }
}