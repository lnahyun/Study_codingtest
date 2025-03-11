#include <string>
#include <vector>
#include <cmath>

using namespace std;

bool prime(long long n) {
    if (n <= 1) {
        return false;
    }
    for (long long i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

int solution(int n, int k) {
    int answer = 0;
    string ans = "";
    while (n > 0) {
        int num = n % k;
        ans = to_string(num) + ans;
        n /= k;
    }
    string temp = "";
    for (char c : ans) {
        if (c == '0') {
            if (!temp.empty() && prime(stoll(temp))) {
                answer++;
            }
            temp = "";
        }
        else {
            temp += c;
        }
    }
    if (!temp.empty() && prime(stoll(temp))) {
        answer++;
    }

    return answer;
}