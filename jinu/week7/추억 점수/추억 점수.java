import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> Map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            Map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];
                if (Map.containsKey(person)) {
                    answer[i] += Map.get(person);
                }
            }
        }

        return answer;
    }
}
