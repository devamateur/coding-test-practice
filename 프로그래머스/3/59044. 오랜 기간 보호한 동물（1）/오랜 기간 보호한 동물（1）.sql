select i.name, i.datetime
from animal_ins i 
    left join animal_outs o
    on i.animal_id = o.animal_id
where o.animal_id is null       -- 교집합 제외
order by i.datetime
limit 3;