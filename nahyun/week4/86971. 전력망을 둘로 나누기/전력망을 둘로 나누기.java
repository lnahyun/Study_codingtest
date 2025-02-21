import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int min = 100;

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] wire : wires) {
            list.get(wire[0]).add(wire[1]);
            list.get(wire[1]).add(wire[0]);
        }

        for (int[] wire : wires) {
            int node1 = wire[0];
            int node2 = wire[1];

            list.get(node1).remove(Integer.valueOf(node2));
            list.get(node2).remove(Integer.valueOf(node1));

            int size1 = bfs(list, node1, n); 
            int size2 = n - size1; //다른쪽

            if(Math.abs(size1 - size2) < min) min = Math.abs(size1-size2);

            //지운 간선 복구
            list.get(node1).add(node2);
            list.get(node2).add(node1);
        }

        return min;
    }

    private int bfs(List<List<Integer>> list, int start, int n) {
        boolean[] visited = new boolean[n + 1];
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int V : list.get(node)) {
                if (!visited[V]) {
                    visited[V] = true;
                    queue.add(V);
                    count++;
                }
            }
        }

        return count;
    }
}
