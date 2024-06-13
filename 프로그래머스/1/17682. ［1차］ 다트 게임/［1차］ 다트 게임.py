def solution(dartResult):
    answer = 0
    
    num_list = [0]*3       # 합계 계산
    nums = ""              # 점수에서 숫자를 저장
    idx = 0                # num_list의 인덱스
    for i in range(len(dartResult)):
        r = dartResult[i]
        # nums에 숫자 저장
        # nums가 문자열인 이유는, 10을 저장하기 위해서
        if r.isdigit():
            nums += r
        if r == '#': 
            num_list[idx-1] *= -1      # 현재 점수에 마이너스
        if r == '*':
            num_list[idx-1] *= 2       # 현재 점수에 두배
            num_list[idx-2] *= 2   # 이전 점수에 두배
                
        if r == 'S':
            num_list[idx] = int(nums)
            idx += 1          # 인덱스 증가
            nums = ""         # nums 초기화
        if r == 'D':
            num_list[idx] = int(nums)**2
            idx += 1
            nums = ""
        if r == 'T':
            num_list[idx] = int(nums)**3
            idx += 1
            nums = ""

    return sum(num_list)