#include <string>
#include <vector>

using namespace std;

string solution(vector<string> survey, vector<int> choices) {
    string answer = "";
    int countA = 0, countN = 0, countC = 0, countF = 0, countJ = 0, countM = 0, countR = 0, countT = 0;
    for(int i = 0; i<survey.size(); i++){
        if(survey[i][0] == 'A' || survey[i][0] == 'N'){
            if (survey[i][0] == 'A') {
                if (choices[i] < 4) {
                    countA += (4 - choices[i]);
                } 
                else {
                    countN += (choices[i] - 4);
                }
            } 
            else {
                if (choices[i] < 4) {
                    countN += (4 - choices[i]);
                } 
                else{
                    countA += (choices[i] - 4);
                }
            }
        }
        else if(survey[i][0] == 'C' || survey[i][0] == 'F'){
            if (survey[i][0] == 'C') {
                if (choices[i] < 4) {
                    countC += (4 - choices[i]);
                } 
                else {
                    countF += (choices[i] - 4);
                }
            } 
            else {
                if (choices[i] < 4) {
                    countF += (4 - choices[i]);
                } 
                else{
                    countC += (choices[i] - 4);
                }
            }
        }
        else if(survey[i][0] == 'J' || survey[i][0] == 'M'){
            if (survey[i][0] == 'J') {
                if (choices[i] < 4) {
                    countJ += (4 - choices[i]);
                } 
                else {
                    countM += (choices[i] - 4);
                }
            } 
            else {
                if (choices[i] < 4) {
                    countM += (4 - choices[i]);
                } 
                else{
                    countJ += (choices[i] - 4);
                }
            }
        }
        else if(survey[i][0] == 'R' || survey[i][0] == 'T') {
            if (survey[i][0] == 'R') {
                if (choices[i] < 4) {
                    countR += (4 - choices[i]);
                } 
                else {
                    countT += (choices[i] - 4);
                }
            } 
            else {
                if (choices[i] < 4) {
                    countT += (4 - choices[i]);
                } 
                else{
                    countR += (choices[i] - 4);
                }
            }
        }
    }
    answer += countR >= countT ? 'R' : 'T';
    answer += countC >= countF ? 'C' : 'F';
    answer += countJ >= countM ? 'J' : 'M';
    answer += countA >= countN ? 'A' : 'N';
    return answer;
}