select mcdp_cd as 진료과코드, count(pt_no) as 5월예약건수
from appointment
where apnt_ymd like '2022-05%'
group by 진료과코드
order by 5월예약건수, 진료과코드;