// 다익스트라랑 같은 기능인 플로이드 워셜로 구현하였습니다..
import java.util.Arrays;

class FloydWarshall {
    public static int[][] floydWarshall(int n, int[][] graph) {
        int INF = 999999999;
        int[][] dist = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int[] edge : graph) {
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];
            dist[u][v] = cost;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        return dist;
    }
}
