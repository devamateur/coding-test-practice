def solution(elements):
    answer = 0
    sum_ = 0
    sum_set = set()
    
    for i in range(len(elements)):
        sum_ = elements[i]
        sum_set.add(sum_)
        for j in range(i+1, i+len(elements)):
            sum_ += elements[j%len(elements)] # 원형 수열이므로 배열의 크기를 넘어가면 다시 처음으로
            sum_set.add(sum_)
    return len(sum_set)