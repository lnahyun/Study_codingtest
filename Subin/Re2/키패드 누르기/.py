  def solution(numbers, hand):
    #각 키에서 0~9키 까지의 거리
    key = {0: [0, 4, 3, 4, 3, 2, 3, 2, 1, 2],  
       1: [4, 0, 1, 2, 1, 2, 3, 2, 3, 4],
       2: [3, 1, 0, 1, 2, 1, 2, 3, 2, 3],
       3: [4, 2, 1, 0, 3, 2, 1, 4, 3, 2],
       4: [3, 1, 2, 3, 0, 1, 2, 1, 2, 3],
       5: [2, 2, 1, 2, 1, 0, 1, 2, 1, 2],
       6: [3, 3, 2, 1, 2, 1, 0, 3, 2, 1],
       7: [2, 2, 3, 4, 1, 2, 3, 0, 1, 2],
       8: [1, 3, 2, 3, 2, 1, 2, 1, 0, 1], 
       9: [2, 4, 3, 2, 3, 2, 1, 2, 1, 0],
       '*': [1, 3, 4, 5, 2, 3, 4, 1, 2, 3],
       '#': [1, 5, 4, 3, 4, 3, 2, 3, 2, 1]
      } 
    left, right = '*', '#'
    L=[1,4,7]
    R =[3,6,9]
    result = ''
    for i in numbers:
        if i in L:
            result += 'L'
            left = i
        elif i in R:
            result += 'R'
            right = i
        else:
            dl = key[left][i]
            dr = key[right][i]
            if dl == dr:
                if hand == 'right':
                    right = i
                    result += 'R'
                else:
                    left = i
                    result +='L'
            elif dl<dr:
                left = i
                result += 'L'
            else:
                right = i
                result += 'R'
    return result
                
            
                
