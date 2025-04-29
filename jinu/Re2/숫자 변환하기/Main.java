import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) return 0;

        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];

        queue.offer(new int[]{x, 0});
        visited[x] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int value = curr[0];
            int count = curr[1];

            int[] nextValues = {value + n, value * 2, value * 3};

            for (int next : nextValues) {
                if (next == y) return count + 1;

                if (next < y + 1 && !visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, count + 1});
                }
            }
        }

        return -1;
    }
}