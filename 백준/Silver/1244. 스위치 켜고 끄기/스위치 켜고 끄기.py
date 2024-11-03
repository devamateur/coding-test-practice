N = int(input())       # 스위치 개수

switches = list(map(int, input().split()))

num = int(input())         # 학생수

students = []

for _ in range(num):
    students.append(list(map(int, input().split())))

for item in students:
    gender = item[0]
    number = item[1]
    if gender == 1:
        for i in range(number-1, N, number):
            switches[i] = 1 if switches[i] == 0 else 0
    else:
        left = number-2
        right = number

        switches[number-1] = 1 if switches[number-1] == 0 else 0

        while left >= 0 and right < N and switches[left] == switches[right]:
            if switches[left] == 1:
                switches[left] = 0
                switches[right] = 0
            else:
                switches[left] = 1
                switches[right] = 1
            left -= 1
            right += 1

if N <= 20:
    for i in range(N):
        print(switches[i], end=" ")
else:
    for i in range(0, N, 20):
        for j in range(i, i+20):
            if j > N-1: break
            print(switches[j], end=" ")
        print()