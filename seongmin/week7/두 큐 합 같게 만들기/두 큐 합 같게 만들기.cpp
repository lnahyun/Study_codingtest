#include <vector>
#include <queue>

using namespace std;

int solution(vector<int> queue1, vector<int> queue2) {
    queue<int> q1, q2;
    long long sum1 = 0, sum2 = 0, total = 0;

    for (int num : queue1) {
        q1.push(num);
        sum1 += num;
    }
    for (int num : queue2) {
        q2.push(num);
        sum2 += num;
    }

    total = sum1 + sum2;
    if (total % 2 != 0) return -1;

    long long target = total / 2;
    int maxOperations = 2 * (queue1.size() + queue2.size());
    int operations = 0;

    while (sum1 != target) {
        if (operations > maxOperations) return -1;

        if (sum1 > target) {
            int front = q1.front();
            q1.pop();
            q2.push(front);
            sum1 -= front;
            sum2 += front;
        }
        else {
            int front = q2.front();
            q2.pop();
            q1.push(front);
            sum2 -= front;
            sum1 += front;
        }
        operations++;
    }

    return operations;
}
