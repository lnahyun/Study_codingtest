import math

def solution(n, k):
    arr = []
    for i in range(n):
        arr.append(i+1)
        
    answer = []
    k -= 1

    for i in range(n, 0, -1):
        fact = math.factorial(i - 1)
        idx = k // fact
        answer.append(arr.pop(idx))
        k %= fact

    return answer

print(solution(3,5))
