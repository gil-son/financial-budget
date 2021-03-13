CREATE DATABASE IF NOT EXISTS financial_budget;
USE financial_budget;

CREATE TABLE IF NOT EXISTS budget(
id_budget INT PRIMARY KEY AUTO_INCREMENT,
description VARCHAR(50) NOT NULL,
category  VARCHAR(50) NOT NULL,
value DOUBLE(8,2) NOT NULL,
status ENUM("To do", "Doing", "Done"),
date datetime DEFAULT CURRENT_TIMESTAMP
);


-- INSERT INTO budget(description, category, value, status) VALUES('Description','Category',4000,'To do');
-- SELECT * FROM budget;



