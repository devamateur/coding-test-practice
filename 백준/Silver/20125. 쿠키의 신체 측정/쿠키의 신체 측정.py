N = int(input())

cookie = []
heart = [0, 0]
counts = [0]*5

for _ in range(N):
    cookie.append(list(input()))

prev = ''
flag = False
for i in range(N):
    for j in range(N):
        if prev == '_' and cookie[i][j] == '*':    # 머리
            heart = [i+2, j+1]
            flag = True
            break
        prev = cookie[i][j]
    if flag:
        break
hx, hy = heart[0]-1, heart[1]-1

while hy > 0:
    hy -= 1
    if cookie[hx][hy] == '*':
        counts[0] += 1
    else:
        break
hy = heart[1]-1
while hy < N-1:
    hy += 1
    if cookie[hx][hy] == '*':
        counts[1] += 1
    else:
        break

hx, hy = heart[0]-1, heart[1]-1
while hx < N-1:
    hx += 1
    if cookie[hx][hy] == '*':
        counts[2] += 1
    else:
        break

leg_x = hx
# 왼쪽 다리
counts[3] = 1
counts[4] = 1
hy -= 1
while hx < N-1:
    hx += 1
    if cookie[hx][hy] == '*':
        counts[3] += 1
    else:
        break

hy += 2
hx = leg_x

while hx < N-1:
    hx += 1
    if cookie[hx][hy] == '*':
        counts[4] += 1
    else:
        break

print(heart[0], heart[1])

for c in counts:
    print(c, end=" ")