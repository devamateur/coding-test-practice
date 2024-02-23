def solution(n):
    
    cache = [0]*n
    cache[0] = 1
    
    if n == 1:
        return cache[0]
    
    cache[1] = 2
    
    for i in range(2, len(cache)):
        cache[i] = cache[i-1] + cache[i-2]
    
    return cache[n-1]%1234567
