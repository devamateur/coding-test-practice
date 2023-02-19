-- 코드를 입력하세요
select CATEGORY, sum(SALES) as TOTAL_SALES
from Book b, BOOK_SALES s
where b.book_ID = s.book_ID
and s.SALES_DATE like '2022-01%'
group by CATEGORY
order by CATEGORY