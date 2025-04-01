import java.util.*;
import java.util.regex.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (a, b) -> {
            Pattern pattern = Pattern.compile("(\\D+)(\\d{1,5})(.*)");
            Matcher matcherA = pattern.matcher(a);
            Matcher matcherB = pattern.matcher(b);

            if (matcherA.matches() && matcherB.matches()) {
                String headA = matcherA.group(1).toLowerCase();
                String headB = matcherB.group(1).toLowerCase();
                int numA = Integer.parseInt(matcherA.group(2));
                int numB = Integer.parseInt(matcherB.group(2));

                int headCompare = headA.compareTo(headB);
                if (headCompare != 0) {
                    return headCompare;
                }
                return Integer.compare(numA, numB);
            }
            return 0;
        });
        return files;
    }
}