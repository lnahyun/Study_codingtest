 def solution(arr, divisor):
    answer = []
    for x in range(len(arr)):
        if(arr[x]%divisor==0):
            answer.append(arr[x])
    if len(answer)==0:
        answer.append(-1)
            
    return sorted(answer) 
