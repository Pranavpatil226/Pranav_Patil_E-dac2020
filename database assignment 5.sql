use assignment4;
Create table EMP ( EMPNO int not null, ENAME varchar(30) not null, JOB varchar(10), 
MGR int, HIREDATE date, SAL int, DEPTNO int );  
drop table EMP;	

Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1000,  'Manish' , 'SALESMAN', 1003,  '2020-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1001,  'Manoj' , 'SALESMAN', 1003,  '2018-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1002 , 'Ashish', 'SALESMAN',1003 , '2013-02-18',  750,  30 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1004,  'Rekha', 'ANALYST', 1006 , '2001-02-18', 3000,  10);
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1005 , 'Sachin', 'ANALYST', 1006 ,  '2019-02-18', 3000, 10 );	
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO) values(1006,  'Pooja',  'MANAGER'  ,     null    , '2000-02-18' ,6000, 10 );
select * from EMP;

Create table dept (dno numeric(4) not null, dname varchar(10) not null,area varchar(30));

Insert into dept(dno,dname,area) values(10,'Store','Mumbai');
Insert into dept(dno,dname,area) values(20,'Purchase','Mumbai');
Insert into dept(dno,dname,area) values(30,'Store', 'Delhi');
Insert into dept(dno,dname,area) values(40,'Marketing','Pune');
Insert into dept(dno,dname,area) values(50,'Finance','Delhi');
Insert into dept(dno,dname,area) values(60,'Accounts','Mumbai');
select * from dept;

delimiter $$
create procedure que1 (in num1 int,num2 int)
begin
declare sum,sub,mul,division int;
set sum=num1+num2;
set sub=num1-num2;
set mul=num1*num2;
set division=num1/num2;
select sum,sub,mul,division;
end $$
call que1(40,20);

#question2 2.	Write a Procedure to print the string in REVERSE order. Take the input using IN parameter
delimiter $$
create procedure Reverse_St(in str varchar(20))
begin
select reverse(str);
end$$
call Reverse_St('pranav');

-- Question 3
delimiter $$
create procedure emp_top_sl(in num int)
begin
select empno,ename,sal from emp order by sal desc limit num;
end $$
call emp_top_sl(5);

#4.	Write a Procedure to create table emp_test with e_id integer, e_name varchar(10), e_joining_date date as columns
delimiter $$
create procedure que()
begin
create table emp_test(e_id int,e_name varchar(10), e_joining_date date);
select * from emp_test;
end$$
call que();
drop procedure que;

#5.	Write a Procedure to add a department row in the DEPT table with the following values for columns
#deptno  value 60,Dname  value should be  ‘Education’, area value should be Pune. 
delimiter $$
create procedure add_dep()
begin
insert into dept values(60,'Education','pune');
select * from dept;
end $$
call add_dep();

#6.	Write a program that declares an integer variable called num, assigns a value to it and print, 
#the value of the variable itself, its square, and its cube.
delimiter $$
create procedure square_cube(in num int)
begin
declare num1,square,cubes int;
set num1=num;
set square=num*num;
set cubes=num*num*num;
select num1,square,cubes;
end $$
call square_cube(2);

#7.	Write a program that declares an integer variable assign a value to it and display it 
# using OUT parameter
delimiter $$
create procedure out_para(out val int)
begin
set val=10;
select val;
end$$
call out_para(@val);
drop procedure out_para;

#8.	Write a program that demonstrates the usage of IN and OUT parameters.
#5.	Write a Procedure to add a department row in the DEPT table with the following values for columns
#deptno  value 60,Dname  value should be  ‘Education’, area value should be Pune. 
delimiter $$
create procedure add_dep()
begin
insert into dept values(60,'Education','pune');
select * from dept;
end $$
call add_dep();

#6.	Write a program that declares an integer variable called num, assigns a value to it and print, 
#the value of the variable itself, its square, and its cube.
delimiter $$
create procedure square_cube(in num int)
begin
declare num1,square,cubes int;
set num1=num;
set square=num*num;
set cubes=num*num*num;
select num1,square,cubes;
end $$
call square_cube(2);

#7.	Write a program that declares an integer variable assign a value to it and display it 
# using OUT parameter
delimiter $$
create procedure out_par(out val int)
begin
set val=10;
select val;
end$$
call out_para(@val);
drop procedure out_para;

#8.	Write a program that demonstrates the usage of IN and OUT parameters.
delimiter $$
create procedure inout_par(inout val int)
begin

set val=val+val;
select val;
end$$
set @val=5;
call inout_par(@val);
#select @val;
drop procedure inout_par;
