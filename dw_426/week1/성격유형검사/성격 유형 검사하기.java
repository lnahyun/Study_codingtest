import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        // 성격 유형, 점수 맴핑
        char[] type = {'R','T','C','F','J','M','A','N'};
        HashMap<Character,Integer> index = new HashMap<>();
        int score[] = new int[8];
        for(int i=0; i<8; i++)
            index.put(type[i],i);

        // 설문 답변 처리 과정
        for(int i=0; i<survey.length; i++){
            char[] arr=survey[i].toCharArray();

            switch (choices[i]){
                case 1 : score[index.get(arr[0])]+=3;
                    break;
                case 2 : score[index.get(arr[0])]+=2;
                    break;
                case 3 : score[index.get(arr[0])]+=1;
                    break;
                case 4 : break;
                case 5 : score[index.get(arr[1])]+=1;
                    break;
                case 6 : score[index.get(arr[1])]+=2;
                    break;
                case 7 : score[index.get(arr[1])]+=3;
                    break;
                default : break;
            }
        }
        // 성격 유형 결정
        String answer = "";
        for(int i=0; i<8; i+=2){
            if(score[i]>score[i+1])
                answer+=type[i];
            else if(score[i]==score[i+1]){
                if(type[i]<type[i+1])
                    answer+=type[i];
                else
                    answer+=type[i+1];
            }
            else
                answer+=type[i+1];
        }
        // 결과 반환
        return answer;
    }
}
