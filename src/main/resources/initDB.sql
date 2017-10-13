DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE users
(
  id         INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  age        INTEGER ,
  name       VARCHAR NOT NULL,
  createdDate TIMESTAMP DEFAULT now(),
  isAdmin    BOOL DEFAULT TRUE
);

