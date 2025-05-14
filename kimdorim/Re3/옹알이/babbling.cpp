#include <string>
#include <vector>

using namespace std;

bool isValid(string word) {
    vector<string> sounds = {"aya", "ye", "woo", "ma"};
    string prev = "";
    int i = 0;

    while (i < word.size()) {
        bool matched = false;
        
        for (string s : sounds) {
            if (word.substr(i, s.size()) == s && s != prev) {
                matched = true;
                prev = s;
                i += s.size();
                break;
            }
        }
        
        if (!matched) {
            return false;
        }
    }
    
    return true;
}

int solution(vector<string> babbling) {
    int answer = 0;
    for (string word : babbling) {
        if (isValid(word)) {
            answer++;
        }
    }
    return answer;
}
