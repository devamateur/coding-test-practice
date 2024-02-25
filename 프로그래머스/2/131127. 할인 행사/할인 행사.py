def solution(want, number, discount):
    answer = 0
    
    item_dict = dict(zip(want, number))      # {제품:수량}
    count = 0
    
    for i in range(len(discount)-9):
        count = 0
        sales_item = discount[i:i+10]
        
        for k, v in item_dict.items():
            if sales_item.count(k) == v:
                count += 1
            if count == len(want):
                answer += 1
    
    return answer