N = int(input())

result = 0
for i in range(N):
    digits = str(i)
    cur_sum = i
    for ch in digits:
        cur_sum += int(ch)
    if cur_sum == N:
        result = i
        break
print(result)