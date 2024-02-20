def solution(arr):
    answer = 0
    
    arr.sort()
    max_ = arr[len(arr)-1]
    
    while answer < len(arr):
        answer = 0
        for i in range(len(arr)):
            if max_%arr[i] == 0:
                answer += 1
            else:
                max_ += 1
    
    return max_
