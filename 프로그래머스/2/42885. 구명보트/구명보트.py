import sys

def solution(people, limit):
    answer = 0
    
    people.sort()
    
    min_, max_ = 0, len(people)-1
        
    while min_ <= max_:
        if people[min_] + people[max_] <= limit:
            min_ += 1
        answer += 1
        max_ -= 1
        
    return answer