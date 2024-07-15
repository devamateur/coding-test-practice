select distinct r.car_id
from car_rental_company_car r, car_rental_company_rental_history h
where r.car_id = h.car_id
and car_type='세단'
and start_date like '2022-10%'
order by car_id desc;