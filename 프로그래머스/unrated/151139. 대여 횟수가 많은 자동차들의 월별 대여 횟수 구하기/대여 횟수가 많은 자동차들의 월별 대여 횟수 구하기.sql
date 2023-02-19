-- 코드를 입력하세요
select month(START_DATE) as MONTH, CAR_ID, count(CAR_ID) as RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where CAR_ID in (select CAR_ID
                from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                where month(START_DATE) between 8 and 10
                group by CAR_ID
                having count(CAR_ID) >= 5)
and month(START_DATE) between 8 and 10
group by MONTH, CAR_ID
order by MONTH, CAR_ID desc