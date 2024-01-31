def solution(s):
    answer = True
    
    sum_ = 0
    
    for i in range(len(s)):
        if s[i] == '(':
            sum_ += 1
        else:
            sum_ -= 1
        
        if sum_ < 0:
            return False
        
    if sum_ == 0:
        answer = True
    else:
        answer = False

    return answer