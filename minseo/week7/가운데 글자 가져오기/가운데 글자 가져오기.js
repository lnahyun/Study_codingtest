#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    int StringSize = s.length();
    
    if(StringSize % 2 != 0){
        return s.substr(StringSize/2, 1);
    }
    else{
        return s.substr(StringSize/2 -1, 2);
    }
}
