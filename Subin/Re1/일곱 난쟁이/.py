men=[]
for _ in range(9):
    men.append(int(input()))

men.sort()

s =sum(men)
fake = []
for x in range(9):
    for y in range(x+1,9):
        if(len(fake)==2):
            continue
        if(s-men[x]-men[y] == 100):
            fake.append(men[x])
            fake.append(men[y])
            
for x in men:
    if x in fake:
        continue
    print(x)

