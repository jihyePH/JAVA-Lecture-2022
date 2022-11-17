########################################
#
# 데이터 정의 언어 (DDL: Data DEFINITION Language)
#
#######################################

/*
* 1. Table 생성

CREATE TABLE 테이블명 (
    필드명 데이터타입
)
*/
# 주소록 테이블 생성
CREATE TABLE if NOT EXISTS addrBook (
	num INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(4) NOT NULL, 
	tel VARCHAR(14) NOT NULL,
	birthday DATE 
	) AUTO_INCREMENT=101;

# 고객 테이블 생성
CREATE TABLE if NOT EXISTS customer(
	uid VARCHAR(10) PRIMARY key
	pwd CHAR(44) NOT NULL,  	#암호화 결과를 저장
	`name` VARCHAR(4) NOT NULL,
	email VARCHAR(20) ,
	regDate DATE DEFAULT (CURRENT_DATE),
	isDeleted INT DEFAULT 0
);

/*
*2. 테이블 조회
*/
#database 내의 table 목록
SHOW TABLES;

#테이블 구조
DESC customer;

/*
* 3. 테이블 삭제
*/
# test2 table삭제
DROP TABLE test2;

#테이블 내용을 모두 제거
TRUNCATE test;
SELECT * FROM test;

/*
* 4. 테이블 이름 변경
*/
# koreanCity -> korCity
RENAME TABLE koreancity TO korCity;
SHOW TABLES;

/*
* 5. 테이블 구조 변경
*/
# customer table에 tel 항목 추가
ALTER TABLE customer 
	ADD tel VARCHAR(14);
	DESC customer;

#customer 테이블에 tel 항복 삭제
ALTER TABLE customer
	DROP tel;
	DESC customer;

#customer table에 nambe항목 다음에 tel 항목추가
ALTER TABLE customer
	ADD tel VARCHAR(14) AFTER `name`;
	DESC customer;

#customer table의 tell 항목의 not null 추가
ALTER TABLE customer
	CHANGE tel tel VARCHAR(14) NOT NULL;

/*
* 6. view 생성
*/
# 인구 900만 이상인 도시로  largecity 뷰 생성
DROP VIEW largecity;
CREATE VIEW largeCity
	AS SELECT * FROM city WHERE Population >=9000000
	WITH CHECK OPTION;

# 서울의 인구를 8900000으로 변경하면 error 발생 (check OPTION 위배)
UPDATE largeCity SET population=8900000 WHERE id=2331;

# city table에서 변경하면 largeCity에도 반영됨
UPDATE City SET population=9900000 WHERE id=2331;

	