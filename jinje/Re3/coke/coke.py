def solution(a, b, n):
    answer = 0
    remain = 0
    while n >= a:
        print("n:",n,"remain:",remain)
        answer = answer + (n // a) * b
        remain = n % a
        n = (n // a) * b + remain
    return answer
