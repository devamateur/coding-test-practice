def solution(citations):
    answer = 0
    
    # 내림차순 정렬
    citations.sort(reverse=True)
    
    if citations[-1] > len(citations):
        return len(citations)
    
    for i in range(len(citations)):
        if citations[i] == i+1:
            answer = citations[i]
            break
        elif citations[i] < i+1:
            answer = i
            break
            
    return answer