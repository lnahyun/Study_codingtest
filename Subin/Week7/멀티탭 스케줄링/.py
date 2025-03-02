N, K = map(int,(input().split()))
USE = list(map(int,input().split()))

multitap = []
result = 0
#멀티탭 상태 확인 시작
for i in range(K):
    if USE[i] in multitap:
        continue

    if len(multitap)<N:
        multitap.append(USE[i])
        continue

    #멀티탭에서 뺄 것 결정
    check = []
    for j in range(i+1,K):
        if USE[j] in multitap and USE[j] not in check:
            check.append(USE[j])

    #기존의 콘센트 제거    
    for d in multitap:
        if d not in check:  # 이후에 사용되지 않는 코드가 있으면 뽑음
            multitap.remove(d)
            break
    else:
        multitap.remove(check[-1]) 

#콘센트 추가
    multitap.append(USE[i])
    result +=1
    

print(result)

        
            

