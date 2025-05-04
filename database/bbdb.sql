create database If Not Exists BucketBudget;
USE BucketBudget;

create table If Not Exists Buckets (
	id int Not Null AUTO_INCREMENT,
    name varchar(50),
    PRIMARY KEY(id)
);

create table If Not Exists SubBuckets (
	id int Not Null AUTO_INCREMENT,
    bucketId int,
    name varchar(50),
    PRIMARY KEY(id),
    CONSTRAINT `bucket`
		FOREIGN KEY (`bucketId`)
        REFERENCES Buckets(`id`)
        ON DELETE SET NULL
        ON UPDATE CASCADE
);

create table IF Not Exists Transactions(
	id int Not Null Auto_Increment,
    date Date,
    subBucketId int,
    amount Decimal(19, 2),
    description varchar(255),
    PRIMARY KEY(id),
	CONSTRAINT `subbucket`
		FOREIGN KEY(`subBucketId`)
        REFERENCES SubBuckets(`id`)
        ON DELETE SET NULL
        ON UPDATE CASCADE
);

CREATE OR REPLACE View BudgetSummary AS
select s.id, s.name, IFNULL(SUM(t.amount), 0) as amountAvailable
from SubBuckets as s
LEFT Join Transactions t on s.id = t.subBucketId
Group by s.id;

delimiter //
CREATE PROCEDURE Transfer(
	date Date,
    origin int, 
    destination int,
    amount Decimal(19, 2),
    description varchar(255)
)
BEGIN
	INSERT INTO Transactions (date, subBucketId, amount, description) VALUES (date, origin, (amount*-1), description);
    INSERT INTO Transactions (date, subBucketId, amount, description) VALUES (date, destination, amount, description);
END;
//
delimiter ;

