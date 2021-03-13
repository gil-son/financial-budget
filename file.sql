CREATE DATABASE IF NOT EXISTS financial_budget;
USE financial_budget;

CREATE TABLE IF NOT EXISTS input(
id_input INT PRIMARY KEY AUTO_INCREMENT,
description VARCHAR(50) NOT NULL,
category  VARCHAR(50) NOT NULL,
value DOUBLE(8,2) NOT NULL,
status ENUM("To do", "Doing", "Done"),
date datetime DEFAULT current_timestamp
);


CREATE TABLE IF NOT EXISTS output(
id_output INT PRIMARY KEY AUTO_INCREMENT,
description VARCHAR(50) NOT NULL,
category  VARCHAR(50) NOT NULL,
value DOUBLE(8,2) NOT NULL,
status ENUM("To do", "Doing", "Done"),
date datetime DEFAULT current_timestamp
);

