\c postgres;
drop database vote;
create database vote;
\c vote;

create table admin(name varchar(30),password varchar(30));
insert into admin values ('aditya','1234'),('amar', '1234');

create table addvoter1 (
voterid varchar(100) primary key ,
password varchar(100),
name varchar(100),
fathername varchar(100),
address varchar(200),
sex varchar(100),
age varchar(100)
);

select * from addvoter1;

create table result5(id int, partyname varchar(100),count int);

insert into result5(partyname, count, id) values 
    ('BJP',0,1), 
    ('INC',0,2), 
    ('CPI',0,3), 
    ('BSP',0,4), 
    ('NCP',0,5);

select * from result5;
create table partylist1(party varchar(20), leader varchar(20), sex varchar(5), age varchar(5), headq varchar(20), sign varchar(20));
