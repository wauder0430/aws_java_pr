use ezen;

drop table reply;
drop table board;
drop table fav;
drop table account;



create table account(
    uID varchar(50) primary key comment "아이디",
    uPW varchar(100) not null comment "비밀번호",
    uName varchar(100) not null comment "이름",
    uGender varchar(2) comment "성별",
    uHobby varchar(2) comment "취미",
    joinDate datetime not null default now() comment "가입일자",
    isRetire varchar(2) default "U" comment "탈퇴여부"
) comment "계정목록";

create table fav(
    fNo int auto_increment primary key comment "관리번호",
    fName varchar(2) comment "관심분야명",
    uID varchar(50) comment "회원아이디",
    foreign key(uID) references account(uID)
) comment "관심분야";

create table board(
    bNo int unsigned auto_increment primary key comment "게시글번호",
    bAuthor varchar(50) comment "게시글작성자",
    bType varchar(2) comment "게시판종류",
    bTitle varchar(200) comment "제목",
    bNote text comment "내용",
    wDate datetime default now() comment "작성일",
    hit int unsigned default 0 comment "조회수",
    foreign key(bAuthor) references account(uID)
) comment "게시글목록";

create table reply(
    rNo int unsigned auto_increment primary key comment "댓글번호",
    rNote text comment "댓글내용",
    rDate datetime default now() comment "댓글작성일",
    bNo int unsigned comment "게시글번호",
    uID varchar(50) comment "댓글작성자",
    foreign key(bNo) references board(bNo),
    foreign key(uID) references account(uID)
) comment "댓글목록";
