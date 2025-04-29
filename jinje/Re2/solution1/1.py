def solution(numbers, hand):
    answer = ""
    button = {
        1: (0, 0), 2: (0, 1), 3: (0, 2),
        4: (1, 0), 5: (1, 1), 6: (1, 2),
        7: (2, 0), 8: (2, 1), 9: (2, 2),
        '*': (3, 0), 0: (3, 1), '#': (3, 2)
    }

    left = button['*']
    right = button['#']

    for pos in numbers:
        if pos in [1, 4, 7]:
            answer += 'L'
            left = button[pos]
        elif pos in [3, 6, 9]:
            answer += 'R'
            right = button[pos]
        else:
            target = button[pos]
            l_dist = abs(target[0] - left[0]) + abs(target[1] - left[1])
            r_dist = abs(target[0] - right[0]) + abs(target[1] - right[1])

            if l_dist < r_dist:
                answer += 'L'
                left = target
            elif l_dist > r_dist:
                answer += 'R'
                right = target
            else:
                if hand == "right":
                    answer += 'R'
                    right = target
                else:
                    answer += 'L'
                    left = target

    return answer
