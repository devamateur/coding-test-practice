def solution(s):
    answer = ''
    
    upperFlag = False
    
    for i in range(len(s)):
        if s[i] == ' ':
            answer += ' '
            upperFlag = True
        elif i == 0:
            answer += s[i].upper()
        elif upperFlag:
            upperFlag = False
            answer += s[i].upper()
            continue
        else:
            answer += s[i].lower()
    
    return answer