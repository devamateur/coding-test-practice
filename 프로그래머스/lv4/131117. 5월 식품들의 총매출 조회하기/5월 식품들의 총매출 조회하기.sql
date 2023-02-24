-- 코드를 입력하세요
select p.product_id, product_name, price*sum(amount) as total_sales
from food_product p, food_order o
where p.product_id = o.product_id
and produce_date like '2022-05%'
group by p.product_id
order by price*sum(amount) desc, product_id
