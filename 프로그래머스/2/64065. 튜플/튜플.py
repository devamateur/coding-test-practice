def solution(s):
    answer = []
    
    # 집합은 원소의 순서가 바뀌므로
    # 튜플 (2, 1, 3, 4) -> {{1, 2, 3}, {2, 1}, {1, 2, 4, 3}, {2}}로 표현할 수도 있음
    # 1. 딕셔너리를 이용해 {원소:빈도수}를 저장하는 방법 -> 시간초과
    # 2. 길이가 작은 순서대로 발견한 원소를 집어 넣으면 튜플이 완성
        
    s = s.split('},{')
    for i in range(len(s)):
        s[i] = s[i].replace('{', '')
        s[i] = s[i].replace('}', '')

    s = sorted(s, key=lambda x:len(x))         # 길이가 작은 순 정렬

    count_set = set()
    
    for item in s:
        numbers = item.split(',')

        for num in numbers:
            if int(num) not in answer:
                answer.append(int(num))
        
    
    return answer