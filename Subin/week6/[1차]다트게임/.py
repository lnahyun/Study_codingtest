def solution(dartResult):
    n = ''
    score = []
    number = ['0','1','2','3','4','5','6','7','8','9']
    for i in dartResult:
        if i in number:
            n += i
        # if i.isnumeric(): //isnumeric은 문자열에서만 작동함
        #    n += i
            
        elif i == 'S':
            n = int(n)**1
            score.append(n)
            n = ''
        elif i == 'D':
            n = int(n)**2
            score.append(n)
            n = ''
        elif i == 'T':
            n = int(n)**3
            score.append(n)
            n = ''
        elif i == '*':
            if len(score) > 1:
                score[-2] = score[-2] * 2
                score[-1] = score[-1] * 2
            else:
                score[-1] = score[-1] * 2
        elif i == '#':
            score[-1] = score[-1] * -1
        
    return sum(score)
