
drop database if exists qlythuvien;
create database QLYTHUVIEN;
use qlythuvien;

drop table if exists sach;
create table qlythuvien.sach(
masach varchar(100) primary key,
ten varchar(50) ,
tacgia varchar(50),
nxb date,
soluong int(10)
);

drop table if exists docgia;
create table qlythuvien.docgia(
sothe int not null primary key AUTO_INCREMENT,
ten varchar(50),
khoa varchar(50),
khoahoc varchar(50),
thoihanthe datetime
);

drop table if exists phieumuon;
create table qlythuvien.phieumuon(
masach varchar(100) ,
sothe int not null,
ngaymuon date,
ngaytra date,
ghichu varchar(50),
constraint kc primary key(masach,sothe),
constraint knmasach foreign key(masach) references sach(masach) on delete cascade,
constraint knsothe foreign key(sothe) references docgia(sothe)
on delete cascade/*  xóa hết data có liên quan of các bảng có quan hệ with nhau*/
);
/*3.insert*/
insert into qlythuvien.sach values('s1','toan','anh','2010-2-2',50);
insert into qlythuvien.sach values('s2','van','huynh','2011-3-20',60);
insert into qlythuvien.sach values('s3','su','sam','2025-3-20',560);
insert into qlythuvien.sach values('s4','dia','tuan','510-5-3',90);
insert into qlythuvien.sach values('s5','sinh','van','1000-2-9',25);

insert into qlythuvien.docgia values(1,'xuan','a','b','2018-10-20 23:59:59');
insert into qlythuvien.docgia values(6,'toan','a','b','2018-10-20 23:59:59');
insert into qlythuvien.docgia values(2,'tinh','c','d','2019-10-20 23:59:59');
insert into qlythuvien.docgia values(3,'hieu','a','b','2020-10-20 23:59:59');
insert into qlythuvien.docgia values(4,'huy','e','f','2021-10-20 23:59:59');
insert into qlythuvien.docgia values(5,'hong','g','h','2022-10-20 23:59:59');

insert into qlythuvien.phieumuon values('s1',1,'2012-2-5','2015-2-25','tot');
insert into qlythuvien.phieumuon values('s1',6,'2012-2-5','2015-2-25','tot');
insert into qlythuvien.phieumuon values('s2',3,'2013-5-2','2013-5-28','ban');
insert into qlythuvien.phieumuon values('s3',4,'2014-8-2','2014-8-14','sach');
insert into qlythuvien.phieumuon values('s4',5,'2015-9-3','2015-10-3','kem');
insert into qlythuvien.phieumuon values('s5',2,'2016-2-14','2016-4-25','yeu');

select* from qlythuvien.phieumuon;
/*4.Thực hiên xóa ,cập nhật */
delete from qlythuvien.phieumuon where ghichu='kem';

select* from qlythuvien.phieumuon;

select * from qlythuvien.docgia;
update docgia 
set ten='toan' ,khoa='cong nghe thong tin' ,khoahoc='ct1c'
where sothe=1;
/* 5.hiển thị tên,khoa của những độc giả và sắp xếp theo khoa */
select ten ,khoa
from docgia
order by khoa asc;


select * from docgia;
select*from sach;
select*from phieumuon;

/*6. tìm những độc giả mượn sách toán vào ngày 5/2/2012*/
select dg.ten
from docgia as dg,phieumuon as pm,sach as s
where pm.masach=s.masach and pm.sothe=dg.sothe and s.ten='toan' and pm.ngaymuon='2012-02-05';

/*7. hiện thị tên ,số thẻ,tên sách của tất cả độc giả mượn sách trong tháng 8/2014*/
select dg.ten as 'tên độc giả',dg.sothe as 'số thẻ',s.ten as 'tên sách' 
from docgia as dg,phieumuon as pm,sach as s
where pm.masach=s.masach and pm.sothe=dg.sothe and month(pm.ngaymuon)=8 and year(pm.ngaymuon)=2014;

/*8. danh sách các sách không ai mượn*/
select dg.ten
from docgia as dg,phieumuon as pm
where pm.sothe !=  dg.sothe
group by(dg.ten);

/*9.cho biết đọc giả tên toan mượn sách bao nhiêu lần*/
select count(pm.sothe)
from docgia as dg,phieumuon as pm 
where pm.sothe = dg.sothe and dg.ten='toan'






