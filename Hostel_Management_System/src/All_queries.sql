
CREATE DATABASE HostelManagementSystem;

USE HostelManagementSystem;


CREATE TABLE customer (
  name varchar(25) DEFAULT NULL,
  emailId varchar(30) NOT NULL,
  password varchar(15) DEFAULT NULL,
  mobileNumber varchar(12) DEFAULT NULL,
  PRIMARY KEY (emailId)
 );

			
CREATE TABLE manager (
  name varchar(25),
  emailId varchar(30) NOT NULL,
  password varchar(15) DEFAULT NULL,
  mobileNumber varchar(12),
  PRIMARY KEY (emailId)
 ); 
 
  CREATE TABLE room (
  roomNumber int NOT NULL ,
  roomType varchar(25) DEFAULT NULL,
  description varchar(225) DEFAULT NULL,
  roomCapacity int DEFAULT NULL,
  checkInDate varchar(25) DEFAULT NULL,
  checkOutDate varchar(25) DEFAULT NULL,
  roomCost int DEFAULT NULL
  );
			
 
 CREATE TABLE booking (
  bookingId int NOT NULL AUTO_INCREMENT primary key,
  customerName varchar(25) NOT NULL,
  nummberOfGuests int DEFAULT NULL,
  mobileNumber varchar(30) DEFAULT NULL,
  checkInDate varchar(30) DEFAULT NULL,
  checkOutDate varchar(30) DEFAULT NULL,
  roomType varchar(25) DEFAULT NULL,
  totalBookingCost int DEFAULT NULL,
  bookingStatus varchar(25) DEFAULT NULL,
  cancelledReason varchar(100) DEFAULT NULL
 );
 
INSERT INTO manager
VALUES('manager1','manager@gmail.com','0000','99009900');

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


-----for login -----
SELECT * FROM customer WHERE emailId=? AND password=?

SELECT * FROM manager WHERE emailId=? AND password=?

----searchUserByEmailId-----

SELECT * FROM customer WHERE emailId=? 

SELECT * FROM manager WHERE emailId=?

----registerUsers-------

INSERT INTO customer VALUES(?,?,?,?)

INSERT INTO manager VALUES(?,?)

-----Add Room------

INSERT INTO room(roomNumber, roomType,description,roomCapacity,checkInDate,checkOutDate,roomCost) VALUES(?,?,?,?,?,?,?)
