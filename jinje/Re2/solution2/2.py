def solution(board):
    answer = 0
    row = len(board)
    col = len(board[0])
    
    dp = [[0 for j in range(col)] for i in range(row)]
    for i in range(row):
        for j in range(col):
            if i == 0 or j == 0:
                dp[i][j] = board[i][j]
            elif board[i][j] == 1:
                dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1
            answer = max(answer, dp[i][j])

    return answer ** 2

board = [[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]
print(solution(board))
