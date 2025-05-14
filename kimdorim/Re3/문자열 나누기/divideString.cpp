#include <string>
#include <vector>

using namespace std;

int solution(string s) {
    int answer = 0;
    int countX = 1;
    int countOtherChar = 0;
    char x = s[0];
    int start=0;
    for (int i = 1;i<s.size();i++){
        if(x == s[i]){
            countX++;
        }
        else countOtherChar++;
        if(countX == countOtherChar){
            answer++;
            countX = 0;
            countOtherChar =0;
            x=s[i+1];
        }
    }
    if(countX != countOtherChar) answer++;
    
    
    return answer;
}