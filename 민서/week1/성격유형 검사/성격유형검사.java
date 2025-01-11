import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = new HashMap<>();
        scores.put('R',0);
        scores.put('T',0);
        scores.put('C',0);
        scores.put('F',0);
        scores.put('J',0);
        scores.put('M',0);
        scores.put('A',0);
        scores.put('N',0); // 각 성격유형과 그 초기 점수를 map에 저장 (초기점수는 0으로 설정)
      
        for(int i = 0; i<survey.length; i++){
            char disagree = survey[i].charAt(0); //비동의
            char agree = survey[i].charAt(1); // 동의
            int choice = choices[i];
            
            if(choice <= 3){
                scores.put(agree, scores.get(agree)+(choice-4)); // 비동의 선택이라면 4-choice 만큼 점수 추가
            }
            else if(choice >= 3){
                scores.put(agree, scores.get(agree)+(choice-4)); // 동의일때도 마찬가지
            }
        }
        
        StringBuilder result = new StringBuilder(); // 결과 저장 stringbuilder 사용
        
        result.append(scores.get('R') >= scores.get('T') ? 'R' : 'T');
        result.append(scores.get('C') >= scores.get('F') ? 'C' : 'F');
        result.append(scores.get('J') >= scores.get('M') ? 'J' : 'M');
        result.append(scores.get('A') >= scores.get('N') ? 'A' : 'N');

        return result.toString();
    }
}
