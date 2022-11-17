/*
*데이터 조작 언어 (DML: Data Manipulaiton Language)
*/

/* 1. Select */
USE world; # 사용할 데이터베이스 선택
SHOW TABLES; #
DESC city; #city table구조보기

/*
SELECT 필드명
FROM 테이블명
WHERE 조건
GROUP BY 필드명
HAVING 그룹 조건
ORDER BY 필드명 순서
LIMIT 숫자 OFFSET 숫자;
*/

SELECT * FROM city;  #city 테이블에 있는 내용을 전부 가져오기
SELECT 'NAME', Population FROM city;
SELECT NOW();

/* 1.2 조회 조건 */
SELECT * FROM city WHERE countrycode='KOR';  #한국의 도시 조회
SELECT NAME, district, population FROM city WHERE countrycode='KOR';
SELECT NAME, district, population FROM city 
 		WHERE countrycode='KOR' AND population>1000000;
SELECT DISTINCT  district FROM city     #distinct:고유한
     WHERE countrycode='KOR';           #대한민국 광역시도명

#수도권(서울,인천,경기)
SELECT * from city
  WHERE district = 'Seoul' OR district='inchon' OR district='kyonggi';

#한국의 100만이상인 도시중 인구수가 홀수인도시
SELECT * from city
  WHERE countrycode='KOR'
  AND population >= 1000000
  AND population %2 =1;

#한국의 인구수 50만~100만  도시(1)
SELECT * from city
  WHERE countrycode='KOR'
  AND population >= 500000
  AND population <= 1000000;

#한국의 인구수 50만~100만  도시(2)
SELECT * from city
  WHERE countrycode='KOR'
  AND population between 500000 AND  1000000;

#충청남북도 도시
SELECT * from city
  WHERE countrycode='KOR'
  AND district LIKE 'chungchong%';

  /*1.3 순서 */
  #전세계 인구가 800만 이상인 도시를 내림차순으로 조회
SELECT * from city
  WHERE population >= 8000000
  ORDER BY population DESC ;

  #한국에서 100만 이상인 도시를 내림차순으로 
SELECT * from city
  WHERE population >= 1000000 AND countrycode='KOR'
  ORDER BY population DESC ; 

  #한국에서 50만 이상인 도시를 광역시는 오름차순,인구수는 내림차순 
SELECT * from city
  WHERE population >= 500000 AND countrycode='KOR'
  ORDER BY DISTRICT ASC, population DESC ; #ASC(ascending) 생략가능

  /* 1.4 개수 */
  #전세계 인구 top10
SELECT * from city
 ORDER BY population DESC  #ASC(ascending)
 LIMIT 10;

 #국내  인구 top10
SELECT * from city
WHERE countrycode='KOR'
 ORDER BY population DESC  #ASC(ascending)
 LIMIT 10;
 
 #국내  인구수 11 ~ 20위 도시
SELECT * from city
 WHERE countrycode='KOR'
 ORDER BY population DESC  
 LIMIT 10 OFFSET 10;     // 앞10개 건너뛰고, 10개 선택

 /* 1.5 함수 */
#국내  도시의 개수
SELECT COUNT(*) FROM city
    WHERE countrycode='KOR';

#국내 도시의 평균 인구수
SELECT avg(population) FROM city
	WHERE countrycode='KOR';

SELECT ROUND(avg(population)) FROM city
	WHERE countrycode='KOR';

SELECT ROUND(avg(population)) as avgPopulation FROM city
	WHERE countrycode='KOR';  (Aliasing:AS)

#국내 도시의 최대/최소 인구수
SELECT MAX(population),MIN(population) FROM city
	WHERE countrycode='KOR';  

/* 1.6 그룹 */
#국내 광역시도의 인구수 합계를 내림차순으로 정렬
SELECT district, SUM(population) FROM city
	WHERE countrycode='KOR'
 	GROUP BY district
 	ORDER BY SUM(population) DESC;

#경기도의 도시 이름
SELECT GROUP_CONcat('Name') FROM city
	WHERE district='Kyonggi';
 	
#국내 광역시도  이름
SELECT GROUP_CONcat(district) FROM city
	WHERE countrycode='KOR';

#국가별 도시가 많은나라 top10
SELECT Countrycode, COUNT(*) FROM city
	GROUP BY countrycode 
	ORDER BY COUNT(*) DESC 
	LIMIT 10;

/* 1.7 그룹의 조건*/
#국내 도시의 개수가 5개 이상인 도의 인구수평균
SELECT district, round(AVG(population)), COUNT(*) FROM city
	WHERE countrycode = 'KOR'
	GROUP BY district 
	HAVING COUNT(*) >= 5;

#국내 도시의 개수가 5개 이상인 도의 인구수평균의 내림차순
SELECT district, round(AVG(population)), COUNT(*) FROM city
	WHERE countrycode = 'KOR'
	GROUP BY district 
	HAVING COUNT(*) >= 5
	ORDER BY AVG(population) desc;

#도시의 개수가 100개 이상인 국가의 인구수 평균의 내림차순
SELECT countrycode, Round(AVG(population)), COUNT(*) FROM city	
	GROUP BY countrycode 
	HAVING COUNT(*) >= 100
	ORDER BY AVG(population) desc;

#대륙별 면적, 평균GNP, 국가의 숫자 면적 내림차순 정렬
SELECT CONTINENT, SUM(SURFACEAREA), ROUND(AVG(GNP)), COUNT(NAME)
	FROM COUNTRY
	GROUP BY CONTINENT
	ORDER BY SUM(SURFACEAREA) DESC;
 
#전세계에서 인구가 가장 많은 10개 도시(도시명, 인구수, 언어명)
USE world;
SELECT l.'name', l.population, r.'Language' FROM city AS l
	JOIN countrylanguage AS r
	ON l.CountryCode = r.CountryCode
	WHERE r.isofficial = true
	ORDER BY l.population desc
	LIMIT 10;

/*
* 1.8 SUbQuery
*/
#서울보다 인구가 많은 도시
SELECT* FROM city
	WHERE Population > 
	(SELECT Population FROM city WHERE 'NAME'='Seoul');