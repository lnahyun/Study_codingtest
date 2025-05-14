class Solution {
    public int solution(String s) {
        char[] cs = new char[s.length()];
        for(int i = 0; i<s.length(); i++) {
            cs[i] = s.charAt(i);
        }
        int answer = 0;
        int xCount = 1;
        int yCount = 0; 
        char x = cs[0];
        if(s.length() == 1) return 1;
        for(int i = 1; i<s.length(); i++) {
            if(x == cs[i]) xCount++;
            else yCount++;
            if(xCount == yCount) {
                answer++;
                System.out.println(cs[i]);
                xCount = 1; yCount = 0;
                if(i+1 < s.length()) {
                    if(i+1 == s.length()-1) {
                        xCount++; break;
                    }
                    x = cs[++i];
                }
                else break;
            }
        }
        if(xCount != 1 || yCount != 0) return ++answer;
        return answer;
    }
}
