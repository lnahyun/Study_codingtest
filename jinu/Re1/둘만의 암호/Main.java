import java.util.Arrays;

class Solution {
    public String solution(String s, String skip, int index) {
        int sSize = s.length();
        int skipSize = skip.length();

        char[] sArgs = new char[sSize];
        char[] skipArgs = new char[skipSize];

        for (int i = 0; i < sSize; i++) {
            sArgs[i] = s.charAt(i);
        }

        for (int i = 0; i < skipSize; i++) {
            skipArgs[i] = skip.charAt(i);
        }

        for (int i = 0; i < sSize; i++) {
            int count = 0;
            while (count < index) {
                sArgs[i]++;

                if (sArgs[i] > 'z') {
                    sArgs[i] = 'a';
                }

                boolean isSkip = false;
                for (int j = 0; j < skipSize; j++) {
                    if (sArgs[i] == skipArgs[j]) {
                        isSkip = true;
                        break;
                    }
                }

                if (!isSkip) {
                    count++;
                }
            }
        }

        return new String(sArgs);
    }
}