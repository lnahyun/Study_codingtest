    def solution(wallet, bill):
    answer = 0
    #지갑 크기보다 크면 반복
    while min(bill)>min(wallet) or max(bill)>max(wallet):
        if bill[0]>bill[1]:
            bill[0] //= 2
        elif bill[0]<bill[1]:
            bill[1] //= 2
        answer+=1
        
    return answer
