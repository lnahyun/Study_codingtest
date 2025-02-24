import sys
import heapq

input = sys.stdin.readline

N = int(input())
M = int(input())
graph = [[] for _ in range(N + 1)]
for x in range(M):
    a,b,cost = map(int,input().split())
    graph[a].append([b,cost]) 
#출발지, 목적지지
A,B = map(int,input().split())

def dijkstra(x):
    dist = [float('inf')] * (N + 1)
    dist[x]=0
    heap = []

    heapq.heappush(heap,[0,x]) #시작 노드부터 탐색 시작

    while heap:
        cost, node = heapq.heappop(heap) #탐색할 노드, 비용

        if dist[node]<cost:
            continue

        for next_node, next_cost in graph[node]:
            new_cost = cost + next_cost 
            #더 적은 비용일때 new_cost 갱신
            if new_cost < dist[next_node]:
                dist[next_node] = new_cost
                heapq.heappush(heap,[new_cost,next_node])
                # 새로운 비용과 노드를 추가

    return dist


dist = dijkstra(A)
print(dist[B])
 
