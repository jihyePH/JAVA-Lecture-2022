/*
*데이터 조작 언어 (DML: Data Manipulaiton Language)
*/

/* 2.Update */
#Yong-in 이름을 용인으로 변경학
UPDATE city
	SET `name`='용인'
	WHERE ID=2362;

 #Suwon 이름을 수원으로 바꾸기
UPDATE city
    SET `Name`='수원', Population=1000000
    WHERE ID=2340;

SELECT * FROM city
	WHERE district='Kyonggi';

#강원도의 영어이름을 강원도로 변경
UPDATE city SET district='강원도'
	WHERE district='Kang-won';
    SELECT * FROM city WHERE district='강원도';

/*
* 3. 생성(Insert)

insert into 테이블명(필드명)
*/

# 속초시 추가
INSERT INTO city ('Name', Countrycode, district, population)
	VALUES ( '속초', 'KOR', '강원도', 100000);
SELECT * FROM city WHERE  AND district='강원도';

INSERT INTO city 
	VALUES (DEFAULT, '속초', 'KOR', '강원도', 100000);
SELECT * FROM city WHERE countrycode='kor'AND  district='강원도';

#여러건의 데이터 입력
#경기도의 화성시와 의정부시를 추가
INSERT INTO city
	VALUES (DEFAULT, '화성', 'KOR', 'Kyonggi', 500000),
	(DEFAULT, '의정부', 'KOR', 'Kyonggi', 400000);

# 대량 데이터 삽입
# 국내 도시만으로 새로운 테이블 생성, 기존테이블 데이터로 채우기
CREATE TABLE if NOT EXISTS koreancity LIKE city;
INSERT INTO koreancity
	SELECT * FROM city WHERE countrycode='kor';

/* 
* 4. 삭제(DELETE)
*/
# 4081<= ID <= 4083 레코드 삭제
DELETE FROM koreanCity
	WHERE ID >= 4081 AND ID <= 4083;
SELECT * FROM koreanCity;

# 인구수가 10만 미만인 도시 삭제
DELETE FROM koreanCity
	WHERE population < 100000;
	SELECT * FROM koreanCity;