use ezen;

drop table MEMO;

create table MEMO
(
    mNo int primary key auto_increment comment '�޸��ȣ',
    mTitle varchar(200) comment '����',
    mNote text comment '����'
);

insert
    into MEMO ( mTitle, mNote )
    values ( "1���޸�", "ù DB �������Դϴ�.");

insert
    into MEMO ( mTitle, mNote )
    values ( "2���޸�", "2�� �޸� �����Դϴ�.");

insert
    into MEMO ( mTitle, mNote )
    values ( "3���޸�", "3�� �޸� �����Դϴ�.");
    
insert
    into MEMO ( mTitle, mNote )
    values ("4","����"),("5","����"),("6","����"),("7","����");
    
alter table MEMO add wDate DATETIME;