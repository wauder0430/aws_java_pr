use ezen;

create table memo(
	mNo int primary key auto_increment comment '�޸��ȣ',
	mTitle varchar(200) comment '����',
	mNote text comment '����',
	wDate datetime default now() comment '�ۼ���'
);

insert into memo (mTitle, mNote)
    values ('�޸� �����Դϴ�.', '�޸� �����Դϴ�.');