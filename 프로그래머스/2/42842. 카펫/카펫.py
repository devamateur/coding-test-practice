def solution(brown, yellow):
    
    w, h = 3, 3
    
    for i in range(3, brown+1):
        for j in range(3, brown+1):
            if j>=i and (j-2)*(i-2)==yellow and j*i == brown+yellow:
                w, h = j, i
    answer = [w, h]
    return answer