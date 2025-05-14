def solution(babbling):
    answer = 0
    arr = ["aya", "ye", "woo", "ma"]

    for word in babbling:
        tmp = word
        check = True

        for ptr in arr:
            if ptr * 2 in tmp:
                check = False
                break
        
        if check == False:
            continue

        for ptr in arr:
            tmp = tmp.replace(ptr, " ")
            
        if tmp.strip() == "":
            answer += 1

    return answer
