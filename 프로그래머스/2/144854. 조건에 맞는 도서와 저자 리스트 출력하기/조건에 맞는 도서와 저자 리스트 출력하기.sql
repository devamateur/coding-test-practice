select b.book_id, a.author_name, date_format(published_date, '%Y-%m-%d') as published_date
from book b, author a
where b.author_id = a.author_id
and b.category = '경제'
order by published_date;