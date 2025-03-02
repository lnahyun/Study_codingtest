 n, m, k = map(int, input().split())  
graph = [[0]*m for _ in range(n)]

for _ in range(k):
    r,c = map(int,input().split())
    graph[r-1][c-1] = 1 
#n*m 배열에서 음식물 있는곳은 1

direct= [(1,0),(0,1),(-1,0),(0,-1)]
visit =[[0]*m for _ in range(n)] #방문한 노드 저장
queue=[] #방문 예정 노드 저장
ans =0

for i in range(n):
    for j in range(m):
        if graph[i][j]==1 and not visit[i][j]:
            queue.append([i,j]) #시작점 설정
            visit[i][j] = 1 #방문 표시
            count = 0

            while queue:
                N,M = queue.pop()
                count+=1
                #시작점 근처 다 확인 + 그래프 범위 안인지 확인
                for d in direct:
                    dn,dm = N + d[0], M + d[1]
                    if 0<=dn<n and 0<= dm < m:
                        if graph[dn][dm] == 1 and not visit[dn][dm]:
                            visit[dn][dm] = 1
                            queue.append([dn,dm])

            ans = max(ans,count)
            
print(ans) 
