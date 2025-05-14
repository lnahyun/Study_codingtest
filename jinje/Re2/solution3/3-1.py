import heapq as hq
import math

def solution(x, y, n):
    heap = []
    hq.heappush(heap, (0, x, 0))
    visited = set()
    visited.add(x)

    while heap:
        f, val, cnt = hq.heappop(heap)

        if val == y:
            return cnt

        for num in (val + n, val * 2, val * 3):
            if num <= y and num not in visited:
                visited.add(num)
                g = cnt + 1
                # 휴리스틱 함수를 y - num으로 했는데 원하는 결과가 안나온다
                h = math.ceil(math.log(y / num, 3)) if num < y else 0
                hq.heappush(heap, (g + h, num, g))

    return -1
