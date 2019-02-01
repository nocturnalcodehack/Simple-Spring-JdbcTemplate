create database care;

use database card;

drop table cars;

create table cars (
	id bigint auto_increment,
  name varchar(30),
  price int,
  key(id)
);

insert into cars (name, price) values('Citroen', 1000);
insert into cars (name, price) values('Ford F150', 12000);
insert into cars (name, price) values('Chevy Van', 100);
insert into cars (name, price) values('Crysler', 1);

select * from cars;

