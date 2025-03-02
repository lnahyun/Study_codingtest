import java.util.*;

class Dijkstra {
    static final int MAX_VERTICES = 100;
    static final int INF = Integer.MAX_VALUE;

    // Dijkstra 알고리즘 구현
    public void shortestPath(int v, int[][] cost, int[] distance, int n, boolean[] found) {
        // 초기화
        for (int i = 0; i < n; i++) {
            found[i] = false;
            distance[i] = cost[v][i]; // 출발 노드에서 다른 노드까지의 초기 거리 설정
        }

        found[v] = true;
        distance[v] = 0;

        // n-2번 반복하여 최단 경로 계산
        for (int i = 0; i < n - 2; i++) {
            int u = choose(distance, n, found); // 아직 방문하지 않은 노드 중에서 가장 가까운 노드 선택
            found[u] = true;

            // 선택된 노드 u를 기준으로 경로 갱신
            for (int w = 0; w < n; w++) {
                if (!found[w] && distance[u] + cost[u][w] < distance[w]) {
                    distance[w] = distance[u] + cost[u][w]; // 새로운 경로가 더 짧으면 업데이트
                }
            }
        }
    }
