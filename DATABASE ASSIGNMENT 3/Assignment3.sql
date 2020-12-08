use assignment3;
create table employee(empid int primary key,emp_name varchar(20),dept_id int,salary int,manager int,constraint dept_id_fk foreign key(dept_id) references employee (empid));
create table department(dept_id int primary key,dept_name varchar(20));

insert into department values(1,'finance');
insert into department values(2,'training');
insert into department values(3,'marketing');

insert into employee values(1,'arun',1,8000,4);
insert into employee values(2,'kiran',1,7000,1);
insert into employee values(3,'scott',1,3000,1);
insert into employee values(4,'max',2,9000,null);
insert into employee values(5,'jack',2,8000,4);
insert into employee values(6,'king',null,6000,1);

select * from employee;
select * from department;

select * from employee order by emp_name;
select * from employee order by emp_name desc;

#select all data and sum of salary from employee and group according to deptid.
select *,sum(salary) from employee group by dept_id;

#select deptid and sum of salary where salary is greater than 17000 and group by deptid.
select dept_id,sum(salary) from employee group by dept_id having sum(salary)>17000;

#select deptid and sum of salary where sum of salary is greater than 18000 and grup by deptid.
select dept_id,sum(salary) from employee group by dept_id having sum(salary)>18000;

#select deptid and sum of salary where sum of salary is less than 20000 and grup by deptid
select dept_id,sum(salary) from employee group by dept_id having sum(salary)<20000;


