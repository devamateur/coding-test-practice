N, K = map(int, input().split())      # N: 식탁길이, K: 햄버거 선택 거리

table = list(input())
burger_count = 0

for i in range(N):
    if table[i] == 'P':
        for j in range(i-K, i+K+1):
            if j < 0 or j > N-1: continue
            if table[j] == 'H':
                table[j] = 0
                burger_count += 1
                break

print(burger_count)