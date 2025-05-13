#정답 문제여서 코드만
def solution(s):
    answer = 0
    #x 수 세고 y 수 세고 같아질때마다 
    #x,y 초기화하고/ x값 바꾸고 결과값 +1
    s = s + ' '
    x = s[0]
    cx = 1
    cy =0
    for  i in range(1,len(s)-2):
        #숫자 세기
        if s[i] == x:
            cx +=1
            if cx == cy:
                answer +=1
                cx =0
                cy=0
                if s[i+1]==' ':
                    break
                else:
                    x= s[i+1]
        else:
            cy +=1
            if cx == cy:
                answer +=1
                cx =0
                cy=0
                if s[i+1]==' ':
                    break
                else:
                    x= s[i+1] 

    return answer +1
