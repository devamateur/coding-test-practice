def solution(s):
    answer = []
    
    zeros = 0
    counts = 0
    
    while s != '1':
        zeros += s.count('0')
        print(zeros)
        counts += 1
        s = s.replace('0', '')
        s = format(len(s), 'b')       # 접두어(0b) 제외
        
    answer.append(counts)
    answer.append(zeros)
    
    return answer