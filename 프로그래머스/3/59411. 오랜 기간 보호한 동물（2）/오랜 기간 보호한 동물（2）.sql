select o.animal_id, o.name
from animal_ins i, animal_outs o
where i.animal_id = o.animal_id
 order by o.datetime - i.datetime desc
limit 2;