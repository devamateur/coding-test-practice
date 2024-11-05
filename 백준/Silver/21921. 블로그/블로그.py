N, X = map(int, input().split())

visits = list(map(int, input().split()))
s = [0]*(N+1)          # 겹치는 구간을 카운트하기 위해 N+1크기의 합 배열 사용
s[1] = visits[0]
for i in range(2, N+1):
    s[i] = s[i-1] + visits[i-1]

max_visit = 0
visit_length = 0
for i in range(N, -1, -1):
    if i-X < 0: continue
    
    visit_sum = s[i]-s[i-X]
    if max_visit < visit_sum:
        max_visit = visit_sum
        visit_length = 1
    elif max_visit == visit_sum:
        visit_length += 1  

if max_visit == 0:
    print('SAD')
else:
    print(max_visit)
    print(visit_length)