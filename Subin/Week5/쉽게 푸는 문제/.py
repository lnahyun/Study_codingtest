a,b= map(int,(input().split()))
nums = []
for i in range(46): #임의의 숫자를 넣어서 찾은 값임
    for j in range(i+1):
        nums.append(i+1)
    if len(nums)>=1000:
        break
result = sum(nums[a-1:b])
print(result)
