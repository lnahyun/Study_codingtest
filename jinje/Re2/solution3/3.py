def solution(x, y, n):
    queue = [(x,0)]
    visited = set()

    ptr = 0;
    while ptr < len(queue):
        val, cnt = queue[ptr]
        ptr += 1
        
        if val == y:
            return cnt

        for num in (val + n, val * 2, val * 3):
            if num <= y and num not in visited:
                visited.add(num)
                queue.append((num, cnt + 1))
    return -1
