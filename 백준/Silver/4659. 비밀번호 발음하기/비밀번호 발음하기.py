vowels = ['a', 'e', 'i', 'o', 'u']

while True:
    word = input()
    if word == 'end':
        break
    no_vowel = 0            # 모음이 없는 경우 카운트
    v_count = 0             # 연속된 모음 카운트
    c_count = 0             # 연속된 자음 카운트
    prev = ''
    flag = False

    for w in word:
        if w not in vowels:
            no_vowel += 1

    if no_vowel == len(word):
        flag = True
        
    for i in range(len(word)-2):
        if word[i] in vowels and word[i+1] in vowels and word[i+2] in vowels:
            flag = True
            break
        elif word[i] not in vowels and word[i+1] not in vowels and word[i+2] not in vowels:
            flag = True
            break

    if v_count >= 3 or c_count >= 3:
        flag = True
        
    for i in range(len(word)-1):
        if word[i] == word[i+1] and word[i] != 'e' and word[i] != 'o':
            flag = True
            break
    if flag:
        print(f'<{word}> is not acceptable.')
    else:
        print(f'<{word}> is acceptable.')