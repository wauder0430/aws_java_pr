// DDL Data Definition Language
// 데이터 정의언어

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

// 9. 테이블 컬럼 변경
// - 추가
alter table 테이블이름 add 컬럼이름 타입;
// - 수정
alter table 테이블이름 modify 컬럼이름 타입;
// - 삭제
alter table 테이블이름 drop 컬럼이름;
