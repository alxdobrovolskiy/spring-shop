CREATE TABLE IF NOT EXISTS CURRENCY
(
id integer not null PRIMARY KEY AUTO_INCREMENT,
name varchar(8) not null,
code integer
);

CREATE TABLE IF NOT EXISTS UnitMeasure
(
id integer not null PRIMARY KEY AUTO_INCREMENT,
name varchar(16) not null
);

CREATE TABLE IF NOT EXISTS PRODUCT
(
id integer not null PRIMARY KEY AUTO_INCREMENT,
name varchar(64) not null,
price float,
currency_id integer,
unitMeasure_id integer,
foreign key(currency_id) references public.currency(id),
foreign key(unitMeasure_id) references public.unitMeasure(id)
);

