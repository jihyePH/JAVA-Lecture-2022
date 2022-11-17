########################################
#
# 날짜 /시간 조작
#
#######################################

/*
* 1. 테이블 생성
*/

CREATE Table dateTable(
	id INT PRIMARY KEY AUTO_INCREMENT,
	`date` DATE,
	`datetime` DATETIME DEFAULT CURRENT_TIMESTAMP 
	) AUTO_INCREMENT=101;
	DESC dateTable;

/*
* 2. date 입력
*/

INSERT INTO dateTable VALUES(DEFAULT, '2022-11-17', DEFAULT );
INSERT INTO dataTable(`date`, `datetime`) VALUES
 ('2022-11-17', '2021-11-23 11:23:01');

/*
* 3. 데이터 조회
*/
#2022-11-17 형식의 값을 얻기
SELECT `date`, DATE_FORMAT(`datetime`, '%Y-%m-%d') FROM dateTable;

#=22-11-17 14:28
SELECT DATE_FORMAT(`datetime`, '%y-%m-%d %h-%i') as modifyTime 
	FROM dateTable;

#날짜 조회 함수
SELECT NOW(), CURDATE(), CURTIME();

#날짜 더하기 빼기
SELECT DATE_ADD(NOW(), INTERVAL 40 day);
SELECT DATE_SUB(NOW(), INTERVAL 3 month);

#D-day 계산
SELECT TO_DAYS('2023-03-08') - TO_DAYS(NOW());

# 요일 : 1-일요일 
SELECT DAYOFWEEK(`datetime`) FROM dateTable;