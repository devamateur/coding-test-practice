select i.item_id, item_name
from item_info i, item_tree t
where i.item_id = t.item_id
and t.parent_item_id is null
order by item_id;