--liquibase formatted sql

--changeset id:1 author:graph context="standard"
CREATE TABLE CUSTOMER
(
    id              VARCHAR(36) NOT NULL,
    customer_number VARCHAR(15) NOT NULL,
    title           VARCHAR(10),
    first_name      VARCHAR(50) NOT NULL,
    last_name       VARCHAR(50) NOT NULL,
    gender          VARCHAR(1)  NOT NULL,
    birth_date      DATE
);

ALTER TABLE customer
    ADD CONSTRAINT PK_CUSTOMER PRIMARY KEY (id);
ALTER TABLE customer
    ADD CONSTRAINT UK_PERSON_CUSTOMER_NUMBER UNIQUE (customer_number);

CREATE TABLE ADDRESS
(
    id           VARCHAR(36) NOT NULL,
    street       VARCHAR(50) NOT NULL,
    additional   VARCHAR(150),
    number       VARCHAR(11),
    zipcode      VARCHAR(5)  NOT NULL,
    city         VARCHAR(50) NOT NULL,
    state        VARCHAR(50),
    country      VARCHAR(50) NOT NULL,
    address_type VARCHAR(1)  NOT NULL,
    customer_id  VARCHAR(36) NOT NULL
);

ALTER TABLE ADDRESS
    ADD CONSTRAINT PK_ADDRESS PRIMARY KEY (id);
ALTER TABLE ADDRESS
    ADD CONSTRAINT FK_ADDRESS_CUSTOMER FOREIGN KEY (customer_id) REFERENCES CUSTOMER (id);