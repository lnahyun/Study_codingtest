def check_x(x, y, city_map, arr):
    if city_map[x][y] == 2:
        if y > 0:
            return check_x(x-1, y, city_map, arr)
        else:
            return 0
    else:
        return arr[x][y]
    
def check_y(x, y, city_map, arr):
    if city_map[x][y] == 2:
        if y > 0:
            return check_y(x, y-1, city_map, arr)
        else:
            return 0
    else:
        return arr[x][y]

def solution(m, n, city_map):
    arr = [[0] * n for _ in range(m)]
    arr[0][0] = 1
    
    for x in range(1, n):
        if city_map[0][x] != 1:
            arr[0][x] = arr[0][x-1]
    
    for y in range(1, m):
        if city_map[y][0] != 1:
            arr[y][0] = arr[y-1][0]
    
    for i in range(1, m):
        for j in range(1, n):
            if city_map[i][j] == 1:
                continue
            if city_map[i][j] == 2:
                if i > 0:
                    arr[i][j] += check_x(i-1, j, city_map, arr)
                if j > 0:
                    arr[i][j] += check_y(i, j-1, city_map, arr)
            else:
                if i > 0:
                    arr[i][j] += check_x(i-1, j, city_map, arr)
                if j > 0:
                    arr[i][j] += check_y(i, j-1, city_map, arr)      
    
    return arr[m-1][n-1] % 20170805

print(solution(3, 3, [[0, 0, 0], [0, 0, 0], [0, 0, 0]]))
print(solution(3, 6, [[0, 2, 0, 0, 0, 2], [0, 0, 2, 0, 1, 0], [1, 0, 0, 2, 2, 0]]))
