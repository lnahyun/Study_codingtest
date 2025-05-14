  def solution(babbling):
    answer = 0
    A = ["aya", "ye", "woo", "ma"]

    for i in range(len(babbling)):
        pre = ''
        word =''
        compare =''
        
        for j in range(len(babbling[i])):
            word += babbling[i][j]
            if word in A:
                if pre == word:
                    break
                else:
                    compare += word
                    pre = word
                    word =''
            if compare ==babbling[i]:
                answer+=1

    return answer
