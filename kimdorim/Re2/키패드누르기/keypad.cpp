#include <string>
#include <cstring>
#include <vector>

using namespace std;

string solution(vector<int> numbers, string hand) {
    string answer = "";
    int left_hand = 10;
    int right_hand = 12;

    for (int i = 0; i < numbers.size(); i++) {
        int number = numbers.at(i);
        if (number == 0) number = 11;

        if (number == 1 || number == 4 || number == 7) {
            answer.append("L");
            left_hand = number;
        }
        else if (number == 3 || number == 6 || number == 9) {
            answer.append("R");
            right_hand = number;
        }
        else {
            int left_distance = abs((left_hand - 1) / 3 - (number - 1) / 3)
                              + abs((left_hand - 1) % 3 - (number - 1) % 3);
            int right_distance = abs((right_hand - 1) / 3 - (number - 1) / 3)
                               + abs((right_hand - 1) % 3 - (number - 1) % 3);

            if (left_distance < right_distance) {
                answer.append("L");
                left_hand = number;
            }
            else if (left_distance > right_distance) {
                answer.append("R");
                right_hand = number;
            }
            else {
                if (hand == "left") {
                    answer.append("L");
                    left_hand = number;
                } else {
                    answer.append("R");
                    right_hand = number;
                }
            }
        }
    }
    return answer;
}
