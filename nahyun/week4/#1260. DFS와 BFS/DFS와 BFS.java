import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int[][] graph = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        // DFS
        boolean[] visited = new boolean[N + 1];
        StringBuilder sb1 = new StringBuilder();
        dfs(sb1, V, visited, graph, N);
        sb1.setLength(sb1.length()-1);
        System.out.println(sb1);

        // BFS
        visited = new boolean[N + 1]; // 방문 배열 초기화
        StringBuilder sb2 = new StringBuilder();
        bfs(sb2, V, visited, graph, N);
        sb2.setLength(sb2.length()-1);
        System.out.println(sb2);
    }

    public static void dfs(StringBuilder sb, int node, boolean[] visited, int[][] graph, int N) {
        visited[node] = true;
        sb.append(node).append(" ");

        for (int i = 1; i <= N; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(sb, i, visited, graph, N);
            }
        }
    }

    public static void bfs(StringBuilder sb, int node, boolean[] visited, int[][] graph, int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");

            for (int i = 1; i <= N; i++) {
                if (graph[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
