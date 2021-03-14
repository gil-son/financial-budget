CREATE DATABASE IF NOT EXISTS financial_budget;
USE financial_budget;

CREATE TABLE IF NOT EXISTS budget(
id_budget INT PRIMARY KEY AUTO_INCREMENT,
thedescription VARCHAR(50) NOT NULL,
thecategory  ENUM("Input", "Output") NOT NULL,
thevalue DOUBLE(8,2) NOT NULL,
thestatus ENUM("To do", "Doing", "Done") NOT NULL,
date datetime DEFAULT CURRENT_TIMESTAMP
);

 -- desc budget ;


-- CRUD

-- READ
 SELECT * FROM budget;

-- CREATE
 INSERT INTO budget(thedescription, thecategory, thevalue, thestatus) VALUES('Savings account','Input',40,'To do');

-- UPDATE
UPDATE budget SET thecategory = 'Snack' WHERE id_budget = 7;

-- DELETE
DELETE FROM budget WHERE id_budget = 1;


-- Order by value (descrescent)

SELECT * FROM budget ORDER BY thevalue desc;









