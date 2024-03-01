def solution(cacheSize, cities):
    answer = 0
    
    st = []
    
    for i in range(len(cities)):
        st.append(cities[i].lower())

        if len(st) > cacheSize:     # 캐시가 찬 경우
            top = st[-1]

            if top in st[:-1]:  # cache hit
                st.pop(st.index(top))
                answer += 1
            else:              # cache miss
                st = st[1:]
                answer += 5
        else:
            top = st[-1]

            if top in st[:-1]:  # cache hit
                answer += 1
            else:              # cache miss
                answer += 5
        
    return answer