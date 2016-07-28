select * from member;
create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	reg_date varchar2(20),
	ssn varchar2(10),
	email varchar2(30),
	profile_img varchar2(100)
);
-- CREATE
insert into member(id,pw,name,reg_date,ssn,email,profile_img,phone) 
values('lee3','1','이술신','2016-07-01','800101-1','lee@test.com','lee3.jpg',010-3303-5533);
insert into member(id,pw,name,reg_date,ssn,email,profile_img,phone) 
values('hong2','1','홍길동','2015-07-01','100701-1','hong2@test.com','hong2.jpg',010-1123-5151);
insert into member(id,pw,name,reg_date,ssn,email,profile_img,phone) 
values('kim','1','김유신','2013-07-01','090701-3','kim@test.com','kim.jpg'm010-1234-2234);
-- READ ()
select * from member; -- list
select * from member where id = 'hong';-- findByPK
select * from member where gender = '남';-- findByNotPK
select count(*) as count from member; -- count

-- UPDATE
update member set email = id || '@test.com';
update member set pw = '1' where id = 'lee3';
alter table member add phone varchar2(30);
alter table member add profile_img varchar2(100);
alter table member modify phone varchar2(15);
update member set ssn = '811111-1' where id = 'te1';
update member set profile_img = id||'.jpg' where profile_img IS NULL;
-- DELETE
delete from member where id = 'hong2';
delete from member where id = 'lee5';
delete from member where id = 'te1';


