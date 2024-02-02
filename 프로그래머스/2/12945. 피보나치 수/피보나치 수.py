def solution(n):
    
    cache = [0]*100001
    
    cache[1] = 1
    
    for i in range(2, n+1):
        cache[i] = cache[i-1] + cache[i-2]
    
    return cache[n]%1234567