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