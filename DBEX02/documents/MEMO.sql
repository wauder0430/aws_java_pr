use ezen;

drop table MEMO;

create table MEMO
(
    mNo int primary key auto_increment comment '메모번호',
    mTitle varchar(200) comment '제목',
    mNote text comment '내용'
);

insert
    into MEMO ( mTitle, mNote )
    values ( "1번메모", "첫 DB 데이터입니다.");

insert
    into MEMO ( mTitle, mNote )
    values ( "2번메모", "2번 메모 내용입니다.");

insert
    into MEMO ( mTitle, mNote )
    values ( "3번메모", "3번 메모 내용입니다.");
    
insert
    into MEMO ( mTitle, mNote )
    values ("4","내용"),("5","내용"),("6","내용"),("7","내용");
    
alter table MEMO add wDate DATETIME;