def solution(n, arr1, arr2):
    answer = []

    for i in range(len(arr1)):
        num = arr1[i]|arr2[i]
        result = ''

        for bit in bin(num)[2:]:
            if bit == '1':
                result += '#'
            else:
                result += ' '
        if len(result) < n:
            result = ' '*(n-len(result))+result
        answer.append(result)
            
    return answer