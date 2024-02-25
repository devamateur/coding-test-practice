import re
def solution(s):
    answer = 0

    st = []
    
    for i in range(len(s)):
        newS = s[i:] + s[:i]
        
        for j in range(len(s)):
            st.append(newS[j])
        
            if len(st) >= 2:
                if st[-1] + st[-2] in (')(', '}{', ']['):
                    st.pop()
                    st.pop()
                    
        if len(st) == 0:
            answer += 1
            
        st = []

    return answer