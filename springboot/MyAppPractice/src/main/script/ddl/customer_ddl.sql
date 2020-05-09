create table customer (
cust_id NUMBER(5,2) PRIMARY KEY,
cust_address varchar2(20),
actv_flg varchar2(1)
);



create sequence cust_exp_seq
start with 2
increment by 1
nocache
nocycle;

create sequence customers_seq
start with 101
increment by 1
nocache
nocycle;