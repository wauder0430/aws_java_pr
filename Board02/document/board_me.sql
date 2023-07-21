create table userList(
    userID varchar(50) not null primary key,
    userPW varchar(100) not null,
    userName varchar(100) not null,
    userGender varchar(2),
    constraint checkGender check (userGender = 'F' || usergender ='M'),
    userHobby varbinary(2),
    constraint checkHobby check (userHobby >= 1 || userHobby <= 5),
    userState varchar(2),
    constraint checkState check (userState = 'U' || userState = 'R'),
    usersignDate datetime
);

create table writeList(
    writeNo int not null primary key,
    writeTitle varchar(200),
    writeDate datetime,
    writeNote text,
    writeRead int unsigned,
    writeKind varchar(2) not null,
    userID varchar(50),
    foreign key(userID)
    references userList(userID) on update cascade,
    constraint checkWriteKind check (writeKind = 'JV' ||
    writeKind = 'HS' ||  
    writeKind = 'CS' || 
    writeKind = 'JS')
);

create table commentList(
    commentNo int unsigned not null primary key,
    commentNote text,
    commentDate datetime,
    writeNo int,
    foreign key(writeNo)
    references writeList(writeNo) on update cascade,
    userID varchar(50),
    foreign key(userID)
    references userList(userID) on update cascade
);

create table favoriteList(
    favNo int unsigned not null primary key,
    favorite varbinary(2),
    userID varchar(50),
    foreign key(userID)
    references userList(userID) on update cascade,
    constraint checkfav check (favorite >= 1 || favorite <= 5)
);
