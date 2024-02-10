def solution(n):
    ans = 0
    
    # 점프와 순간이동
    # 짝수일 때는 순간이동, 홀수일 때 점프
    while(n != 0):
        if n%2 == 0:
            n /= 2
        else:
            n -= 1
            ans += 1

    return ans