// DML Data Manipulation Language
// 데이터 조작어

// 1. 테이블에 자료 등록
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

// 2. 테이블 자료 조회
select
    컬럼, 컬럼 [목록]
    from 테이블이름
    [where 선택조건]
    [group by 컬럼명]	// 그룹으로 묶음
    [order by 컬럼명]	// 대상 컬럼 데이터로 정렬
    [desc]	// Descending 내림차순
    [asc]	// Ascending  오름차순 -> 기본설정
    [limit] // 조회할 데이터의 갯수를 제한
    
// 3. 테이블의 모든 자료 조회
select * from 테이블명;

// 4. 테이블 자료 수정
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
    
// 5. 테이블 자료 삭제
delete from 테이블이름 [where];

delete from MEMO;
    where mTitle = "4";
    
insert
    into MEMO ( mTitle, mNote )
    values ( "new", "note");
