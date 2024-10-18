nums = []

avg = 0
for _ in range(5):
    n = int(input())
    nums.append(n)
    
    avg += n

avg = avg // 5

nums.sort()

print(avg)
print(nums[2])