select i.id, n.fish_name, i.length
from fish_info i, fish_name_info n
where i.fish_type = n.fish_type
and i.length = (
    select max(i2.length)
    from fish_info i2
    where i2.fish_type = i.fish_type
)