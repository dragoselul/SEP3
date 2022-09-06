CREATE SCHEMA Cinema;
SET SCHEMA 'Cinema';
CREATE TABLE movie(
    movieID int PRIMARY KEY NOT NULL,
    name varchar(30) NOT NULL,
    length int NOT NULL
);

CREATE TABLE room (
    roomID int PRIMARY KEY NOT NULL,
    capacity int NOT NULL
);

CREATE TABLE customer (
    customerID int PRIMARY KEY NOT NULL,
    f_name varchar(30) NOT NULL,
    l_name varchar(30) NOT NULL,
    birthday DATE NOT NULL
);

CREATE TABLE ticket (
  ticketID int PRIMARY KEY NOT NULL,
  cost int NOT NULL,
  ticketReview varchar(100) NOT NULL,
  customerID references customer(customerID)
);

CREATE TABLE MovieScreening (
  startDate DATE NOT NULL,
  endDate DATE NOT NULL,
  ticketID references ticket(ticketID),
  roomID references room(roomID),
  movieID references movie(movieID)
);