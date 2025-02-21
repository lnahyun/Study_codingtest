#include <string>
#include <vector>

using namespace std;

int solution(int n, int m, vector<int> section) {
    int count = 0;
    int lastPainted = 0;

    for (const auto& pos : section) {
        if (pos > lastPainted) {
            lastPainted = pos + m - 1;
            count++;
        }
    }

    return count;
}
