N, K = map(int, input().split())      # N: 식탁길이, K: 햄버거 선택 거리

table = list(input())
burger_count = 0
visited = [False]*N

p_list = []
for i in range(N):
    if table[i] == 'P':
        p_list.append(i)

for i in p_list:
    for j in range(i-K, i+K+1):
        if j < 0 or j > N-1: continue
        if table[j] == 'H':
            if visited[j]:
                continue
            burger_count += 1
            visited[j] = True
            break

print(burger_count)