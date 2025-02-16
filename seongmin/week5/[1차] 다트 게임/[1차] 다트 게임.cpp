#include <string>
#include <vector>

using namespace std;

int solution(string dartResult) {
    int answer = 0;
    string num = "";
    vector<int> v;
    for (int i = 0; i < dartResult.size(); i++) {
        int index = v.size() - 1;
        if (dartResult[i] >= '0' && dartResult[i] <= '9') {
            num += dartResult[i];
        }
        else if (dartResult[i] == 'S') {
            v.push_back(stoi(num));
            num = "";
        }
        else if (dartResult[i] == 'D') {
            v.push_back(stoi(num) * stoi(num));
            num = "";
        }
        else if (dartResult[i] == 'T') {
            v.push_back(stoi(num) * stoi(num) * stoi(num));
            num = "";
        }
        else if (dartResult[i] == '*') {
            if (index == 0) {
                v[index] *= 2;
            }
            else {
                v[index - 1] *= 2;
                v[index] *= 2;
            }

        }

        else if (dartResult[i] == '#') {
            v[index] = -v[index];
        }
    }

    for (int i = 0; i < v.size(); i++) {
        answer += v[i];
    }

    return answer;
}