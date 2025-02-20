#include <string>
#include <vector>

using namespace std;

int solution(int num) {
    long long n = num;
    int count = 0;
    if (num == 1) {
        return 0;
    }
    while (n != 1) {
        if (count >= 500) {
            count = -1;
            break;
        }
        n = (n % 2 == 0) ? (n / 2) : (n * 3 + 1);
        count++;
    }

    return count;
}