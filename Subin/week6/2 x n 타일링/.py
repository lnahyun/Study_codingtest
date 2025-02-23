#성공
#힌트를 보니 1000000007을 최종 연산이 아닌 중간 연산에 하면 시간 오류가 나지 않았다
 def solution(n):
    count = [0, 1, 2] + [0] * (n - 2)

    for x in range(3, n + 1):
        count[x] = (count[x - 2] + count[x - 1]) % 1000000007

    return count[n]


#1차 실패
#시간 초과가 나서 다른 방법을 찾아야했다
  def solution(n):
    count = []
    count.append(0)
    for x in range(1,n+1):
        if x == 1:
            count. append(1)
        elif x == 2:
            count. append(2)
        else:
            count.append(count[x-2] +count[x-1])
    answer = count[n] % 1000000007
    return answer  

#2차 실패
# 배열의 크기를 한정하고, 0,1,2를 기존 배열에 넣어두고 실행하였다 그런데도 시간 초과가 났다.
    def solution(n):

    count = [0,1,2] + [0]*(n-2)
    for x in range(3,n+1):
        count[x] = count[x-2]+count[x-1]
            
    answer = count[n] % 1000000007
    return answer
