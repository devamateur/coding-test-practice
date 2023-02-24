-- 코드를 입력하세요
select MEMBER_NAME, REVIEW_TEXT, date_format(REVIEW_DATE, '%Y-%m-%d') as REVIEW_DATE
from MEMBER_PROFILE p, REST_REVIEW r
where p.MEMBER_ID = r.MEMBER_ID
and p.MEMBER_ID = (select MEMBER_ID
                  from REST_REVIEW
                  group by MEMBER_ID
                  order by count(MEMBER_ID) desc
                  limit 1)
order by REVIEW_DATE, REVIEW_TEXT

