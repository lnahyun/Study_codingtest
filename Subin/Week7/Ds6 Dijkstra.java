package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Node {
    int v, cost;

    public Node(int v, int cost) {
        this.v = v;
        this.cost = cost;
    }
}


public class Dijkstra_main {


    public void Dijkstra(int n, int start) {

        int dist[] = new int[n+1];
        ArrayList<Node>[] graph = new ArrayList[n + 1];
        //graph 인덱스에 간선 추가 후 동작
        boolean visited[] = new boolean[n+1];
        int INF = Integer.MAX_VALUE;

        Arrays.fill(dist, INF);
        dist[start] = 0;

        //비교 문법 = 람다식을 이용해서 하면 됨
        PriorityQueue<Node> q = new PriorityQueue<Node>((A,B) -> A.cost - B.cost);
        q.add(new Node(start, 0));

        while(!q.isEmpty()) {
            Node now = q.poll();

            if(visited[now.v])
                continue;
            else
                visited[now.v] = true;

            for(Node next:graph[now.v]){
                if(!visited[next.v] && dist[next.v] > now.cost + next.cost) {
                    dist[next.v] = now.cost + next.cost;
                    q.add(new Node(next.v, dist[next.v]));
                }
            }
        }
    }

}

