N = int(input())          # 지방의 수

country = list(map(int, input().split()))

budget = int(input())

if sum(country) <= budget:      # 모든 지방에 예산을 배정할 수 있으면, 배정 예산의 최댓값 출력
    print(max(country))
else:
    country.sort()          # 지방의 예산요청을 오름차순으로 정렬
    
    left, right = 0, max(country)
    
    while left <= right:
        mid = (left+right)//2        # 현재까지의 상한
        
        budget_sum = 0
        for cost in country:
            if cost <= mid:          # 지방의 예산요청이 상한보다 작으면 요청값을 더함
                budget_sum += cost
            else:                   # 상한보다 예상요청이 크면 상한을 더함
                budget_sum += mid
        
        if budget_sum <= budget:        # 합이 예산보다 작거나 같으면 상한 증가
            left = mid + 1
        else:                 # 합이 예산보다 크면 상한 감소
            right = mid -1
    print(right)