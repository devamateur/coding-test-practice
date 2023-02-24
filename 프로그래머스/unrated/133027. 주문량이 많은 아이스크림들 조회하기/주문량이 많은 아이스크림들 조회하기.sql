-- 코드를 입력하세요
select f.flavor
from FIRST_HALF f, JULY j
where f.flavor = j.flavor
group by j.flavor
order by f.total_order + sum(j.total_order) desc
limit 3

