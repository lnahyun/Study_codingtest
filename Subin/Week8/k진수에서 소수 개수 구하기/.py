  def solution(n, k):
    #n진수 변환
    base = ''

    while n>0:
        base = str(n%k) + base
        n //= k
        
    
    #0기준으로 자름
    cut = base.split('0')
    
    #소수이면서 0포함 하지 않는 것들만 추가
    def is_prime(n):
        if n < 2:
            return False 
        for i in range(2,int(n ** 0.5) + 1):  # n의 제곱근까지
            if n % i == 0:  
                return False 
        return True
    
    answer=0
    for x in cut:
        if x!="" and is_prime(int(x)):
            answer+=1
    return answer
