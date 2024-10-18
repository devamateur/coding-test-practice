N, K = map(int, input().split())

maps = []

for _ in range(N):
    idx, gold, silver, bronze = map(int, input().split())
    maps.append((idx, gold, silver, bronze))

new_maps = sorted(maps, key=lambda x: (x[1], x[2], x[3]), reverse=True)

rank = 0
prev = 0
for c in new_maps:
    if c[0] == K:
        break
    if prev != 0 and prev[0] != c[0] and prev[1] == c[1] and prev[2] == c[2] and prev[3] == c[3]:
        continue
    rank += 1

print(rank)