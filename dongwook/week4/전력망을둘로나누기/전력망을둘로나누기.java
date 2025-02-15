package Study_codingtest.dongwook.week4;

import java.util.*;

class 전력망을둘로나누기 {
    private List<Integer>[] graph;
    private boolean[] visited;
    private int minDiff = Integer.MAX_VALUE;

    public int solution(int n, int[][] wires) {
        // 그래프 초기화
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 그래프 구성
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph[a].add(b);
            graph[b].add(a);
        }

        // 각 전선을 하나씩 끊어보며 최소 차이를 찾음
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];

            // 전선 끊기
            graph[a].remove(Integer.valueOf(b));
            graph[b].remove(Integer.valueOf(a));

            // DFS로 각 서브 그래프의 노드 수 계산
            visited = new boolean[n + 1];
            int countA = dfs(a);
            int countB = n - countA;

            // 최소 차이 갱신
            minDiff = Math.min(minDiff, Math.abs(countA - countB));

            // 전선 다시 연결
            graph[a].add(b);
            graph[b].add(a);
        }

        return minDiff;
    }

    private int dfs(int node) {
        visited[node] = true;
        int count = 1;

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                count += dfs(neighbor);
            }
        }

        return count;
    }
}
