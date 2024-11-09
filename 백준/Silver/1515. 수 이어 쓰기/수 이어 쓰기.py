nums = input()
counter = 1
idx = 0

while idx < len(nums):
    for digit in str(counter):
        if digit == nums[idx]:
            idx += 1
            if idx == len(nums):
                break
    counter += 1

print(counter - 1)
