// 1. 데이터베이스 조회
show databases;

// 2. 데이터베이스 생성
create database DB이름;

// 3. 데이터베이스 선택
use DB이름;

// 4. 데이터베이스 삭제
drop database DB이름;

// 5. 테이블 생성
create table 테이블이름
(
   컬럼이름 컬럼타입 [옵션들] [primary key],
   컬럼2 타입,
   컬럼3 타입 [comment '코멘트']
);

// 6. 테이블 목록 조회
show tables;

// 7. 테이블 정보 조회
desc 테이블이름;

// 8. 테이블 삭제
drop table 테이블이름;

// 9. 테이블에 자료 등록
insert into 테이블명( 컬럼명 나열 ) values( 값 나열);

insert
    into MEMO ( mTitle, mNote )
    values ( "1번메모", "첫 DB 데이터입니다.");
    
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

// 10. 테이블 자료 조회
select
    컬럼, 컬럼 [목록]
    from 테이블이름
    [where 선택조건]
    [group by 컬럼명]	// 그룹으로 묶음
    [order by 컬럼명]	// 대상 컬럼 데이터로 정렬
    [desc]	// Descending 내림차순
    [asc]	// Ascending  오름차순 -> 기본설정
    [limit] // 조회할 데이터의 갯수를 제한
    
// 테이블의 모든 자료 조회
select * from 테이블명;

// 11. 테이블 자료 수정
update 테이블이름
    set
    컬럼이름 = 바꿀 값
    where 조건식;
    
update MEMO
    set mNote = "바뀐 내용"
    where mNo = 3;

update MEMO
    set mNote = "일괄로 바뀐 내용"
    where mNote = "내용";
    
// 12. 테이블 자료 삭제
delete from 테이블이름 [where];

delete from MEMO;
    where mTitle = "4";
    
insert
    into MEMO ( mTitle, mNote )
    values ( "new", "note");
    
    
    
    
    
    

