CREATE USER 'moon'@'localhost' IDENTIFIED BY '5730'
CREATE USER 'admin'@'%' IDENTIFIED BY '5730'

create database personalInfo CHARACTER SET utf8

--create table personalInfo.user (
--  id varchar(50) not null primary key,
--  name varchar(50),
--  aliase varchar(50),
--  weight DOUBLE,
--  birthDay DATE,
--  gender varchar(10),
--  role varchar(10),
--  changed TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
--  registered TIMESTAMP DEFAULT CURRENT_TIMESTAMP
--) engine innodb character set utf8;

