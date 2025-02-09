def solution(X, Y):
    #같은 문자들 반복문으로 찾고 추가(몇 개 같은지 보기) -> 내림차순으로 정렬 
    S = []
    X, Y =list(X),list(Y)
    n=0
    check = list(set(X)) 

    for i in range(len(check)):
        a = X.count(check[i])
        b = Y.count(check[i])
        if b>0 :#같은 만큼 추가
            for _ in range(min(a,b)):
                S.append(check[i])
                n+=1
                                
    S.sort(reverse=True)
    result = "".join(S)
    
    #만약 X,Y 같은게 없으면
    if n==0:
        result = "-1"

    zero = S.count("0")                
    #모두 0이면
    if zero == n and n>0:
        result = "0"
    
    return result
