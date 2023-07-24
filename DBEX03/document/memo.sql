use ezen;

create table memo(
	mNo int primary key auto_increment comment '메모번호',
	mTitle varchar(200) comment '제목',
	mNote text comment '내용',
	wDate datetime default now() comment '작성일'
);

insert into memo (mTitle, mNote)
    values ('메모 제목입니다.', '메모 내용입니다.');