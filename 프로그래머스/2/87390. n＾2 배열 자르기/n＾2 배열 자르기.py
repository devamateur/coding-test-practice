def solution(n, left, right):
    answer = []

    # 2차원 배열로 풀으니 시간초과...
    # 수식으로 접근해서 해결
    for i in range(left, right+1):
        answer.append(max(i//n, i%n)+1)
                
    return answer