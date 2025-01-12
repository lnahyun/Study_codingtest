package week1;

import java.util.*;

class 성격유형검사 {
    public String solution(String[] survey, int[] choices) {
        // 성격 유형의 문자 배열
        char[] type = {'R','T','C','F','J','M','A','N'};
        // 성격 유형 문자를 인덱스로 매핑할 HashMap (문자 → 인덱스)
        HashMap<Character,Integer> index = new HashMap<>();
        // 각 성격 유형에 대한 점수를 기록할 배열 (초기 값은 0)
        int score[] = new int[8];

        // 성격 유형 문자를 인덱스와 매핑
        for(int i=0; i<8; i++)
            index.put(type[i],i);

         // 각 설문에 대한 응답 처리
        for(int i=0; i<survey.length; i++){
            char[] arr=survey[i].toCharArray();

            // 사용자가 선택한 점수에 따라 점수를 추가
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

        // 최종적으로 성격 유형을 결정할 문자열 변수
        String answer = "";
         // 성격 유형은 8가지가 있고, 두 개씩 묶어서 비교
        for(int i=0; i<8; i+=2){
            // 두 성격 유형의 점수를 비교하여 더 높은 점수를 가진 유형을 선택
            if(score[i]>score[i+1])
                answer+=type[i]; // 첫 번째 성격 유형이 더 높을 경우

            // 점수가 같으면 알파벳 순서대로 선택
            else if(score[i]==score[i+1]){
                if(type[i]<type[i+1])
                    answer+=type[i]; // 첫 번째 성격 유형이 알파벳 순서가 더 앞일 경우
                else
                    answer+=type[i+1]; // 두 번째 성격 유형이 알파벳 순서가 더 앞일 경우
            }
            else
                answer+=type[i+1]; // 두 번째 성격 유형이 더 높을 경우
        }
        return answer; // 최종 성격 유형 문자열 반환
    }
}
