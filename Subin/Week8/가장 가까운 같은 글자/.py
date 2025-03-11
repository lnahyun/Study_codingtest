def solution(s):
    answer =[]
    for y in range(len(s)):
        same_n =-1
        for x in range(0,y):
            if s[x] == s[y]:
                same_n = y-x
        
        answer.append(same_n)


    
    return answer
