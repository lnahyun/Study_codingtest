def solution(s):
    answer = 0
    tmp = 0
    cnt = 0
    text = s[0]

    for i in range(len(s)):
        if tmp == 0:
            text = s[i]
            tmp = 1
            cnt = 0
        else:
            if s[i] == text:
                tmp += 1
            else:
                cnt += 1
            if tmp == cnt:
                answer += 1
                tmp = 0

    if tmp != 0:
        answer += 1

    return answer
