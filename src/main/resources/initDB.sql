DROP TABLE IF EXISTS students;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE students
(
  id         INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  age        INTEGER ,
  name       VARCHAR NOT NULL,
  createdDate TIMESTAMP DEFAULT now(),
  isAdmin    BOOL DEFAULT TRUE
);

