use library;
create table member4(Member_Id int(5) primary key, Member_Name varchar(30),Member_address varchar(50),Acc_Open_Date date,Membership_type varchar(20),Penalty_Amount int(7));
insert into member4 values('1','Richa Sharma','Pune','2020/12/04','Lifetime','2000');
insert into member4 values('2','Garima Sen','Pune','2020/12/05','Annual','3000');
select * from member4;
desc member4;
select date_format(Acc_Open_Date,'%d-%b-%y') as Acc_Open_Date from member4;
select * from member4;
ALTER TABLE member4 DROP COLUMN Penalty_Amount;
select Member_id,Member_Name,Member_address as ma,date_format(Acc_Open_Date,'%d-%b-%y') as Acc_Open_Date,Membership_type from member4;