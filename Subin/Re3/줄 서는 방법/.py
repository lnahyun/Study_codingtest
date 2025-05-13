  import math

def solution(n, k):
    arr=[i for i in range(1,n+1)]
    answer = []
    
    while (n > 0):
        #부분 경우의 수
        divide = math.factorial(n) // n
        #k번째 배열은 arr[idx] 부분에 포함
        idx = k // divide
        # 나머지를 k에 넣기
        k = k % divide
        if k == 0:
            answer.append(arr[idx-1])
            arr.pop(idx - 1)
        else:
            answer.append(arr[idx])
            arr.pop(idx)
        n -= 1
    return answer
