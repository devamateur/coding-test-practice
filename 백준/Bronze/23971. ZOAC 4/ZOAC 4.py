H, W, N, M = map(int, input().split())

result = 0
col_sum = 0
# 각 열에 앉을 수 있는 인원 수
for i in range(1, W+1, M+1):
    col_sum += 1

# 전체 인원수
for j in range(1, H+1, N+1):
    result += col_sum

print(result)