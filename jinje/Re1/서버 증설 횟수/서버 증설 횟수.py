def check(players, server, m):
    if server >= players // m:
        return False
    else:
        return True

def solution(players, m, k):
    answer = 0
    server = [0] * 24
    for idx in range(24):
        if check(players[idx], server[idx], m) == False:
            continue
        count = players[idx] // m - server[idx]
        answer += count
        for i in range(k):
            if idx + i > 23:
                break
            server[idx + i] += count

    return answer

players = [0, 0, 0, 10, 0, 12, 0, 15, 0, 1, 0, 1, 0, 0, 0, 5, 0, 0, 11, 0, 8, 0, 0, 0]
print(solution(players, 5, 1))
