def solution(files):
    tmp = []
        
    for file in files:
        head, num, tail = '','',''

        for i in range(len(file)):
            if file[i].isdigit():
                head = file[:i]
                number = file[i:]

                for j in range(len(number)):
                    if not number[j].isdigit():
                        tail = number[j:]
                        number = number[:j]
                        break
                        
                tmp.append([head,number,tail])
                break
                
                
                
    tmp = sorted(tmp,key=lambda x:(x[0].lower(),int(x[1])))
    return [''.join(i) for i in tmp]
