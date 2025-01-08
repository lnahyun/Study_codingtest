import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        String[] st = {"R", "T", "C", "F", "J", "M", "A", "N"};
        //map에 미리 추가. null방지
        for(int i = 0; i<st.length; i++) {
            map.put(st[i], 0);
        }
        
        for(int i = 0; i<survey.length; i++) {
            int choice = choices[i]; String pSurvey;
            
            //choice에 따라 값 증가시킬 survey 추출
            if(choice <= 3)
                pSurvey = String.valueOf(survey[i].charAt(0));
            else if(choice == 4)
                continue;
            else
                pSurvey = String.valueOf(survey[i].charAt(1));
            
            //증가시킬 값 설정
            int score;
            if(choice == 1 || choice == 7) score = 3;
            else if(choice == 2 || choice == 6) score = 2;
            else score = 1;
            
            //map에 유형, 값 추가
            map.put(pSurvey, map.get(pSurvey) + score); 
        }
        //비교
        for(int i=0; i<7; i = i+2) {
            int answer1 = map.get(st[i]);
            int answer2 = map.get(st[i+1]);
            if(answer1 > answer2)
                answer+=st[i];
            else if(answer1 == answer2) {
                char ch1 = st[i].charAt(0);
                char ch2 = st[i+1].charAt(0);
                if(ch1 < ch2) answer+=st[i];
                else answer+=st[i+1];
            }  
            else answer+=st[i+1];
        }           
        return answer;
    }
}
