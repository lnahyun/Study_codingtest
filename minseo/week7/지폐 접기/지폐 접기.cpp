#include <string>
#include <vector>

using namespace std;

int solution(vector<int> wallet, vector<int> bill) {
    
    int answer = 0;
   
    int wallet_width = min(wallet[0], wallet[1]);
    int wallet_height = max(wallet[0], wallet[1]);
    int bill_width = min(bill[0], bill[1]);
    int bill_height = max(bill[0], bill[1]);

    while (bill_width > wallet_width || bill_height > wallet_height) {
        
        if (bill_height > bill_width) {
            bill_height /= 2;
        } 
        else {
            bill_width /= 2;
        }
        answer++;

        
        if (bill_width > bill_height) {
            swap(bill_width, bill_height);
        }
    }

    return answer;
}
