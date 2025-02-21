import java.util.*;
import java.io.*;

class Solution {
    public int solution(String dartResult) {
        String[] dart = dartResult.split("");
        List<Integer> list = new ArrayList<>();
        
        int count = 1;
        int result = 0; int preScore = 0;
        for(int i = 0; i<dartResult.length();) {
            int score = Integer.parseInt(dart[i++]);
            String Bonus = dart[i++];
            if(Bonus.equals("0")) {
                score = 10; Bonus = dart[i++];
            }
            String option;
            if(i < dartResult.length()) {
                option = dart[i++];
                if(!option.equals("*") && !option.equals("#")) i--;
            }
            else { 
                option = "0";
            }
            
            //보너스 체크
            if(Bonus.equals("D")) score = score*score;
            else if(Bonus.equals("T")) score = score*score*score;
            
            //스타상, 아차상 체크
            if(option.equals("*")) { //스타상
                if(count == 1) {
                    score *= 2;
                }
                else {
                    result = result + preScore;
                    score *= 2;
                }
            }
            else if(option.equals("#")) { //아차상
                if(count == 1) score *= -1;
                else {
                    score *= -1;
                }
            }
            result = result + score;
            preScore = score;
            count++;            
        }
        return result;
    }
}
