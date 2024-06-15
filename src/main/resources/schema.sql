#DROP DATABASE IF EXISTS samuDatabase;
CREATE DATABASE IF NOT EXISTS samuDatabase;
USE samuDatabase;

create table employees(
      id int not null AUTO_INCREMENT,
      firstName varchar(50) not null,
      lastName varchar(50) not null,
      userName varchar(50) not null,
      password varchar(50) not null,
      PRIMARY KEY ( id )
);


create table timeTracking(
     trackingId int not null AUTO_INCREMENT,
     checkDate DATE NOT NULL,
     morningIn TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     morningOut TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     afternoonIn TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     afternoonOut TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     employeeId INT not null,
     FOREIGN KEY (employeeId)  REFERENCES employees (id)  ON DELETE CASCADE,
     PRIMARY KEY ( trackingId )
);

SET SQL_MODE= 'NO_ENGINE_SUBSTITUTION';
SET SQL_MODE = 'STRICT_TRANS_TABLES';

INSERT INTO employees (firstname, lastname, userName, password)
VALUES ('luis', 'garcia', 'luisg', 'luisg'),
       ('martha', 'perez', 'marthap', 'marthap'),
       ('jose', 'lu', 'josel', 'josel'),
       ('fabian', 'potriz', 'fabianp', 'fabianp');