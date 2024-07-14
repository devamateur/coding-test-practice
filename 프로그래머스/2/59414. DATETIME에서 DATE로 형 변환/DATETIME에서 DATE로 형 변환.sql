select animal_id, name, date_format(datetime, '%Y-%m-%d')    -- date_format
from animal_ins
order by animal_id
