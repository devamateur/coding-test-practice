N, M = map(int, input().split())

maps = []

for _ in range(N):
    maps.append(input())
    

result = []
for i in range(N-7):
    for j in range(M-7):
        check1 = 0         # 왼쪽 위가 W일 때, 다시 칠해야 하는 정사각형 개수
        check2 = 0         # 왼쪽 위가 B일 때, 다시 칠해야 하는 정사각형 개수
        for k in range(i, i+8):
            for l in range(j, j+8):
                if (k+l) % 2 == 0:
                    if maps[k][l] == 'B':
                        check1 += 1
                    else:
                        check2 += 1
                else:
                    if maps[k][l] == 'B':
                        check2 += 1
                    else:
                        check1 += 1
        result.append(check1)       
        result.append(check2)
print(min(result))