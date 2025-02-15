import itertools

def solution(word):
    words = []
    for i in range(5):
        X =  list(itertools.product('AEIOU',repeat = i+1))
        for j in range(len(X)):
            words.append(''.join(X[j]))
            
    words.sort()
    answer = words.index(word)
    return(answer+1)
