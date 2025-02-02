#include <string>
#include <vector>

using namespace std;
int B_max, W_max, B_min, W_min;
void compare(int ans1, int ans2, int ans3, int ans4) {
    if (ans1 > ans2) {
        B_max = ans1;
        B_min = ans2;
    }

    else {
        B_max = ans2;
        B_min = ans1;
    }

    if (ans3 > ans4) {
        W_max = ans3;
        W_min = ans4;
    }

    else {
        W_max = ans4;
        W_min = ans3;
    }
}

int solution(vector<int> wallet, vector<int> bill) {
    int answer = 0;
    compare(bill[0], bill[1], wallet[0], wallet[1]);
    while (B_max > W_max || B_min > W_min) {
        if (bill[0] > bill[1]) {
            bill[0] /= 2;
        }
        else {
            bill[1] /= 2;
        }
        compare(bill[0], bill[1], wallet[0], wallet[1]);
        answer++;

    }
    return answer;
}