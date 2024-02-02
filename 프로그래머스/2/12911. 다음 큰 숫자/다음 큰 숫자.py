def solution(n):
    answer = 0
    
    bigger = n
    while answer == 0:
        bigger += 1
        if str(bin(n)[2:]).count('1') == str(bin(bigger)[2:]).count('1'):
            answer = bigger
            break
    return answer