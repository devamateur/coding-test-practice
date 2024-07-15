select count(id) as fish_count, fish_name
from fish_info i, fish_name_info n
where i.fish_type = n.fish_type
group by i.fish_type, fish_name
order by fish_count desc;