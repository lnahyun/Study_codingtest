import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i<babbling.length; i++) {
            String str1 = babbling[i];
            char[] str = new char[str1.length()];
            
            for(int k = 0; k<str1.length(); k++) {
                str[k] = str1.charAt(k);
            }
            
            boolean check = true;
            char pre = 'A';
            
            for(int j = 0; j<str1.length();) {  
                if(str[j]=='a') {
                    if(j+2 >= str.length) check = false;
                    else if(str[++j]=='y' && str[++j]=='a') {
                        if(pre == str[j-2]) check = false;
                        else pre = str[j-2];
                    }
                    else check = false;
                }
                
                else if(str[j]=='y') {
                    if(j+1 >= str.length) check = false;
                    else if(str[++j]=='e') {
                        if(pre == str[j-1]) check = false;
                        else pre = str[j-1];
                    }
                    else check = false;
                }
                
                else if(str[j]=='w') {
                    if(j+2 >= str.length) check = false;
                    else if(str[++j]=='o' && str[++j]=='o') {
                        if(pre == str[j-2]) check = false;
                        else pre = str[j-2];
                    }
                    else check = false;
                }
                
                else if(str[j]=='m') {
                    if(j+1 >= str.length) check = false;
                    else if(str[++j]=='a') {
                        if(pre == str[j-1]) check = false;
                        else pre = str[j-1];
                    }
                    else check = false;
                }
                else check = false;
                j++;
                
                
                }
            if(check) {answer++; System.out.println(str1);}
            }
            return answer;
        }

    }
