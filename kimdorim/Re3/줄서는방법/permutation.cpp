#include <vector>
using namespace std;

vector<int> solution(int n, long long k) {
    vector<int> answer;
    vector<int> numbers;
    long long factorial = 1;

    for (int i = 1; i <= n; i++) {
        numbers.push_back(i);
        factorial *= i;
    }

    k--;

    for (int i = 0; i < n; i++) {
        factorial /= (n - i);
        int index = k / factorial;
        answer.push_back(numbers[index]);
        numbers.erase(numbers.begin() + index);
        k %= factorial;
    }

    return answer;
}
