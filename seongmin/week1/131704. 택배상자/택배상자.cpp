#include <string>
#include <vector>

using namespace std;

int solution(vector<int> order) {
    int answer = 0;
    vector<int> box;
    int current = 1;

    for (int i = 0; i < order.size(); i++) {
        int target = order[i];

        while (current <= target) {
            box.push_back(current);
            current++;
        }

        if (!box.empty() && box.back() == target) {
            box.pop_back();
            answer++;
        }
        else {
            break;
        }
    }

    return answer;
}
