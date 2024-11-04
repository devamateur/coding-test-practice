N = int(input())
M = int(input())
light_spot = list(map(int, input().split()))

light_spot.sort()

left, right = 1, N
result = N

while left <= right:
    mid = (left + right) // 2  
    can_light_all = True 

    if light_spot[0] - mid > 0:
        can_light_all = False

    for i in range(1, M):
        if light_spot[i] - light_spot[i - 1] > 2 * mid:
            can_light_all = False
            break

    if light_spot[-1] + mid < N:
        can_light_all = False

    if can_light_all:
        result = mid
        right = mid - 1
    else:
        left = mid + 1

print(result)
