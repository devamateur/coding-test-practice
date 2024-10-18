N = int(input())

nums = []

for _ in range(N):
    nums.append(int(input()))
    
for i in range(N):
    for j in range(N-i-1):
        if nums[j] > nums[j+1]:
            nums[j], nums[j+1] = nums[j+1], nums[j]

for n in nums:
    print(n)