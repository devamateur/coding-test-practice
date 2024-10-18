N, K = map(int, input().split())

maps = []

for _ in range(N):
    idx, gold, silver, bronze = map(int, input().split())
    maps.append((idx, gold, silver, bronze))

new_maps = sorted(maps, key=lambda x: (x[1], x[2], x[3]), reverse=True)

idx = 0

for i in range(N):
    if new_maps[i][0] == K:       # 정렬된 후, 국가 K의 인덱스를 저장
        idx = i

for i in range(N):
    if new_maps[idx][1:] == new_maps[i][1:]:      # K와 금, 은, 동 갯수가 같은 경우 인덱스 출력 => 등수
        print(i+1)
        break