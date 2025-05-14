def solution(n, words):
    answer = set()
    answer.add(words[0])
    for i in range(1, len(words)):
        prev = words[i - 1]
        curr = words[i]

        if prev[-1] != curr[0] or curr in answer:
            return [(i % n) + 1, (i // n) + 1]
        
        answer.add(curr)

    return [0,0]
