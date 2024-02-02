def solution(s):
    answer = -1

    stack = []
    
    for i in range(len(s)):
        stack.append(s[i])
        
        if len(stack) >= 2:
            top1, top2 = stack[-1], stack[-2]
            if top1 == top2:
                stack.pop()
                stack.pop()
            
    answer = 1 if len(stack) == 0 else 0

    return answer