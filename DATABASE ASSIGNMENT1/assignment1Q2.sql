use books;
create table book(Book_No int(6) primary key,Book_Name varchar(30),Author_name varchar(30),Cost int(7),Category char(10));
insert into book values('101','Let us C','Denis Ritchie','450','System');
insert into book values('102','Oracle – Complete RefC','Loni','550','Database');
insert into book values('103','Mastering SQL','Loni','250','SDatabase');
insert into book values('104','PL SQL-Ref','ScottUrman','750','Database');
select * from book;
UPDATE book set cost=300 WHERE Book_No=103;
select * from book;
