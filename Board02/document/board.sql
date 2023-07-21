use ezen;

drop table reply;
drop table board;
drop table fav;
drop table account;



create table account(
    uID varchar(50) primary key comment "���̵�",
    uPW varchar(100) not null comment "��й�ȣ",
    uName varchar(100) not null comment "�̸�",
    uGender varchar(2) comment "����",
    uHobby varchar(2) comment "���",
    joinDate datetime not null default now() comment "��������",
    isRetire varchar(2) default "U" comment "Ż�𿩺�"
) comment "�������";

create table fav(
    fNo int auto_increment primary key comment "������ȣ",
    fName varchar(2) comment "���ɺо߸�",
    uID varchar(50) comment "ȸ�����̵�",
    foreign key(uID) references account(uID)
) comment "���ɺо�";

create table board(
    bNo int unsigned auto_increment primary key comment "�Խñ۹�ȣ",
    bAuthor varchar(50) comment "�Խñ��ۼ���",
    bType varchar(2) comment "�Խ�������",
    bTitle varchar(200) comment "����",
    bNote text comment "����",
    wDate datetime default now() comment "�ۼ���",
    hit int unsigned default 0 comment "��ȸ��",
    foreign key(bAuthor) references account(uID)
) comment "�Խñ۸��";

create table reply(
    rNo int unsigned auto_increment primary key comment "��۹�ȣ",
    rNote text comment "��۳���",
    rDate datetime default now() comment "����ۼ���",
    bNo int unsigned comment "�Խñ۹�ȣ",
    uID varchar(50) comment "����ۼ���",
    foreign key(bNo) references board(bNo),
    foreign key(uID) references account(uID)
) comment "��۸��";
