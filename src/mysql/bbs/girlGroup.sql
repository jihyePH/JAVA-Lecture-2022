SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS HitSong;
DROP TABLE IF EXISTS girlGroup;

/* Create Tables */

CREATE TABLE girlGroup
(
	gid int NOT NULL AUTO_INCREMENT,
	gname varchar(20) NOT NULL,
	company varchar(20) NOT NULL,
	debut date default (current_date),  -- default (current_date) 추가
	PRIMARY KEY (gid)
)AUTO_INCREMENT=101;  					--101추가


CREATE TABLE HitSong
(
	sid int NOT NULL AUTO_INCREMENT,
	sname varchar(20) NOT NULL,
	composer varchar(20),
	writer varchar(20),
	gid int NOT NULL,
	PRIMARY KEY (sid)
)AUTO_INCREMENT=1001;

/* Create Foreign Keys */

ALTER TABLE HitSong
	ADD FOREIGN KEY (gid)
	REFERENCES girlGroup (gid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



